/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
  var prefix = "";
  var index = 0;
  var charToCheck;

  if (strs.length === 0 || strs[0] === "") {
    return "";
  } else if (strs.length === 1) {
    return strs[0];
  }

  loop1:
    while (true) {
      if (index >= strs[0].length) {
        break;
      }

      charToCheck = strs[0].charAt(index);
      for (var x = 1; x < strs.length; x++) {
        if (index >= strs[x].length || strs[x].charAt(index) !== charToCheck) {
          break loop1;
        }
      }

      prefix += charToCheck;
      index++;
    }

  return prefix;
};