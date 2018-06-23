/**
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
  var short, long, sum;
  var carry = 0;
  var result = "";

  if (a.length > b.length) {
    short = b;
    long = a;
  } else {
    short = a;
    long = b;
  }

  var longIndex = long.length - 1;
  for (var x = short.length - 1; x >= 0; x--) {
    sum = parseInt(short.charAt(x)) + parseInt(long.charAt(longIndex)) + carry;
    result = (sum % 2) + result;
    carry = (sum > 1) ? 1 : 0;
    longIndex--;
  }

  while (longIndex >= 0) {
    sum = parseInt(long.charAt(longIndex)) + carry;
    result = (sum % 2) + result;
    carry = (sum > 1) ? 1 : 0;
    longIndex--;
  }

  if (carry === 1) {
    result = "1" + result;
  }

  return result;
};