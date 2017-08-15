package ValidParentheses

import "errors"

type node struct {
	next *node
	value byte
}

type stack struct {
	head *node
}

func (s *stack) push (str byte) {
	n := node{value: str}
	n.next = s.head
	s.head = &n
}

func (s *stack) pop () byte {
	n := s.head
	s.head = s.head.next
	return n.value
}

func (s *stack) isEmpty () bool {
	return s.head == nil
}

func (s *stack) seek () (byte, error) {
	if s.isEmpty() {
		return ' ', errors.New("Stack is empty.")
	}

	return s.head.value, nil
}

func isValid(s string) bool {
	stack := stack{}
	parensMap := map[byte]byte{']':'[', '}':'{', ')':'('}

	for x := 0; x < len(s); x++ {
		if _, ok := parensMap[s[x]]; ok {
			if _, err := stack.seek(); err == nil {
				stack.pop()
				continue
			}
		}

		stack.push(s[x])
	}

	return stack.isEmpty()
}