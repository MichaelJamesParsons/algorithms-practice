/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
  var map = {};

  for (var x = 0; x < s.length; x++) {
    if (map.hasOwnProperty(s.charAt(x))) {
      map[s.charAt(x)].count++;
    } else {
      map[s.charAt(x)] = { index: x, count: 1};
    }
  }

  var keys = Object.keys(map);

  for (var y = 0; y < keys.length; y++) {
    if (map[keys[y]].count === 1) {
      return map[keys[y]].index;
    }
  }

  return -1;
};