/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
  if (s.length <= 1) {
    return s.length;
  }

  var map = {};
  var slow = 0;
  var fast = 0;
  var maxLength = 1;

  while (fast < s.length) {
    while (fast < s.length && !map.hasOwnProperty(s.charAt(fast))) {
      map[s.charAt(fast)] = true;
      fast++;
    }

    if (fast - slow > maxLength) {
      maxLength = fast - slow;
    }

    if (fast < s.length && map.hasOwnProperty(s.charAt(fast))) {
      while (s.charAt(slow) !== s.charAt(fast)) {
        delete map[s.charAt(slow)];
        slow++;
      }

      slow++;
      fast++;
    }
  }

  return maxLength;
};