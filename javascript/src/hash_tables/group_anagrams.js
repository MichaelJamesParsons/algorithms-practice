/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
  var map = {};
  strs.forEach(function (str) {
    var key = str.split('').sort().join('');

    if (map.hasOwnProperty(key)) {
      map[key].push(str);
    } else {
      map[key] = [str];
    }
  });

  return Object.values(map);
};