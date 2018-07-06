/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function (board) {
  for (var i = 0; i < board.length; i += 3) {
    for (var j = 0; j < board[0].length; j += 3) {
      if (!isValidSquare(board, i, j)) {
        return false;
      }
    }
  }

  return true;
};

var isValidSquare = function (board, row, col) {
  var map = {};
  for (var i = 0; i < 3; i++) {
    for (var j = 0; j < 3; j++) {
      if (board[i + row][j + col] !== '.' && map.hasOwnProperty(board[i + row][j + col])) {
        return false;
      }

      map[board[i + row][j + col]] = true;
    }
  }

  return true;
};