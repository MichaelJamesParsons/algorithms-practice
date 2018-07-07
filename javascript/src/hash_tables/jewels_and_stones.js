/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S) {
  var map = {};

  S.split('').forEach(function (character) {
    if (!map.hasOwnProperty(character)) {
      map[character] = 1;
    } else {
      map[character] += 1;
    }
  });

  return J.split('').reduce(function (total, jewel) {
    if (map.hasOwnProperty(jewel)) {
      total += map[jewel]
    }

    return total
  }, 0);
};