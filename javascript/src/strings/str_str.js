/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
  if (needle.length === 0) {
    return 0;
  }

  if (needle.length > haystack.length) {
    return -1;
  }

  if (haystack === needle) {
    return 0;
  }

  loop1:
      for (var x = 0; x < haystack.length - needle.length + 1; x++) {
        if (haystack.charAt(x) === needle.charAt(0)) {
          for (var y = 1; y < needle.length; y++) {
            if (haystack.charAt(y + x) !== needle.charAt(y)) {
              continue loop1;
            }
          }

          return x;
        }
      }

  return -1;
};