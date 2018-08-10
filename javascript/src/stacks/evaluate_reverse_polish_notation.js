var evaluate = function (rightOperand, leftOperand, op) {
  switch (op) {
    case '+':
      return leftOperand + rightOperand;
    case '-':
      return leftOperand - rightOperand;
    case '*':
      return leftOperand * rightOperand;
    case '/':
      var value = leftOperand / rightOperand
      return value > 0 ? Math.floor(value) : Math.ceil(value);
    default:
      throw new Error('invalid operation');
  }
}

/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {
  var stack = [];
  var operations = new Set(['+', '-', '*', '/']);
  for (var x = 0; x < tokens.length; x++) {
    if (operations.has(tokens[x])) {
      var value = evaluate(parseInt(stack.pop()), parseInt(stack.pop()), tokens[x]);
      stack.push(value);
    } else {
      stack.push(tokens[x]);
    }
  }

  return parseInt(stack.pop());
};