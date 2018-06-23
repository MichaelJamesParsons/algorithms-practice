/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
  if (matrix.length === 0) {
    return []
  }

  var topBound = 0;
  var bottomBound = matrix.length - 1;

  var leftBound = 0;
  var rightBound = matrix[0].length - 1;
  var result = [];

  while (topBound <= bottomBound && leftBound <= rightBound) {
    // Top
    for (var t = leftBound; t <= rightBound; t++) {
      result.push(matrix[topBound][t]);
    }

    topBound++;

    // Right
    for (var r = topBound; r <= bottomBound; r++) {
      result.push(matrix[r][rightBound]);
    }

    rightBound--;

    if (topBound <= bottomBound) {
      // Bottom
      for (var b = rightBound; b >= leftBound; b--) {
        result.push(matrix[bottomBound][b]);
      }

      bottomBound--;
    }

    if (leftBound <= rightBound) {
      // Left
      for (var l = bottomBound; l >= topBound; l--) {
        result.push(matrix[l][leftBound]);
      }

      leftBound++;
    }
  }

  return result;
};