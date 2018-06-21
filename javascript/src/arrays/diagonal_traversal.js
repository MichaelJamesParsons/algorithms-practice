/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var findDiagonalOrder = function(matrix) {
  if (matrix.length === 0) {
    return [];
  }

  var vec = [];
  var r = matrix.length;
  var c = matrix[0].length;
  var i, j, count, index;

  for(var d = 0; d < (r + c) - 1; d++) {
    if (d < r) {
      i = d;
      j = 0;
    } else {
      i = r - 1;
      j = d - r + 1;
    }

    count = r - (c - j) + 1;
    index = (d % 2 === 0) ? vec.length : vec.length + count - 1;
    while (count > 0) {
      vec[index] = matrix[i][j];

      if (d % 2 === 0) {
        i--;
        j++;
        index++;
      } else {
        i++;
        j--;
        index--;
      }

      count--;
    }
  }

  return vec;
};