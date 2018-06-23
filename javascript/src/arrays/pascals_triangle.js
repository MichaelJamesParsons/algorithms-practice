/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
  if (numRows === 0) {
    return [];
  } else if (numRows === 1) {
    return [[1]];
  } else if (numRows === 2) {
    return [[1], [1, 1]];
  }

  var result = [[1],[1, 1]];
  for (var x = 2; x < numRows; x++) {
    var row = [1];

    for (var y = 1; y <= result[x - 1].length - 1; y++) {
      row.push(result[x - 1][y - 1] + result[x - 1][y]);
    }

    row.push(1);
    result.push(row);
  }

  return result;
};