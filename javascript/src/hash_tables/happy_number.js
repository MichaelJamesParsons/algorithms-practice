/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
  var tmp;

  while (n !== 1 && n !== Infinity) {
    tmp = 0;
    while (n > 0) {
      var digit = Math.pow(n % 10, 2);
      tmp += digit;
      n = Math.floor(n / 10);

      if (digit === n && digit !== 1) {
        return false;
      }
    }

    n = tmp;
  }

  return n === 1;
};