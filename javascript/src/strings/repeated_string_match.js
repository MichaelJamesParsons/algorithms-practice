/**
 * An overly complicated solution.
 *
 * Two mistakes:
 *
 * 1. Assumed iterating over a string would be more efficient than A.includes(B).
 * 2. I didn't know str.repeat() existed.
 *
 * @param {string} A
 * @param {string} B
 * @return {number}
 */
var repeatedStringMatch = function(A, B) {
  var firstChar = B.charAt(0);
  var startIndexOfChar = 0;
  var numLoops = 0;
  var ptr;

  var charIndex = A.indexOf(firstChar, startIndexOfChar);

  outer:
      while (charIndex !== -1) {
        startIndexOfChar = charIndex + 1;
        ptr = charIndex;
        numLoops = 0;
        for (var x = 0; x < B.length; x++) {
          if (A.charAt(ptr) !== B.charAt(x)) {
            charIndex = A.indexOf(firstChar, startIndexOfChar);
            continue outer;
          }

          if (ptr + 1 >= A.length && x < B.length - 1) {
            numLoops++;
            ptr = 0;
          } else {
            ptr++;
          }
        }

        return numLoops + 1;
      }

  return -1;
};

/**
 * Know that I know str.repeat() exists...
 *
 * @param A
 * @param B
 * @returns {number}
 */
var repeatedStringMatch = function(A, B) {
  var repeats = Math.ceil(B.length / A.length);
  return A.repeat(repeats).includes(B) ? repeats :
      A.repeat(repeats + 1).includes(B) ? repeats + 1 : -1;
};