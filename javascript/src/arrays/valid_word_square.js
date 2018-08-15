/**
 * @param {string[]} words
 * @return {boolean}
 */
var validWordSquare = function(words) {
  for (var x = 0; x < words.length; x++) {
    var y = 0;

    while (y < x + 1) {
      // row is longer than column OR
      // column is longer than row OR
      // word is longer than list OR
      // characters are not the same.
      if ((y >= words[x].length && x < words[y].length) ||
        (y < words[x].length && x >= words[y].length) ||
        words[x].length > words.length ||
        words[x][y] !== words[y][x]) {
        return false;
      }

      y++;
    }
  }

  return true;
};