/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
  var sMap = {};
  var tMap = {};
  for (var x = 0; x < s.length; x++) {
    if (sMap.hasOwnProperty(s.charAt(x)) && sMap[s.charAt(x)] !== t.charAt(x)) {
      return false;
    } else {
      sMap[s.charAt(x)] = t.charAt(x);
    }

    if (tMap.hasOwnProperty(t.charAt(x)) && tMap[t.charAt(x)] !== s.charAt(x)) {
      return false;
    } else {
      tMap[t.charAt(x)] = s.charAt(x);
    }
  }

  return true;
};