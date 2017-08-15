package ValidParentheses

import "testing"

func TestValidPair(t *testing.T) {
	if !isValid("()") {
		t.Error("Expected () to be valid. Result is invalid.")
	}

	if !isValid("[]") {
		t.Error("Expected [] to be valid. Result is invalid.")
	}

	if !isValid("{}") {
		t.Error("Expected {} to be valid. Result is invalid.")
	}
}

func TestValidGroups (t *testing.T) {
	if !isValid("()[]{}") {
		t.Error("Expected ()[]{} to be valid. Result is invalid.")
	}
}

func TestInvalidGroups (t *testing.T) {
	if !isValid("([)])") {
		t.Error("Expected ([)]) to be invalid. Result is valid.")
	}
}

func TestHalfPair (t *testing.T) {
	if isValid("[") {
		t.Error("Expected [ to be invalid. Result is valid.")
	}
}