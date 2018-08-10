/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
  var stack = [];
  var map = { ')': '(', ']': '[', '}': '{'};

  for (var x = 0; x < s.length; x++) {
    if (map[s.charAt(x)]) {
      var open = stack.pop();

      if (open === undefined || map[s.charAt(x)] !== open) {
        return false;
      }
    } else {
      stack.push(s.charAt(x));
    }
  }

  return stack.length === 0;
};