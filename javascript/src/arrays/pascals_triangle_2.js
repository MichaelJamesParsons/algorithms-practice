/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
  if (rowIndex === 0) {
    return [1];
  } else if (rowIndex === 1) {
    return [1,1];
  }

  var prevRow = [1,1];
  for (var x = 2; x <= rowIndex; x++) {
    for (var y = prevRow.length - 1; y > 0; y--) {
      prevRow[y] = prevRow[y] + prevRow[y - 1];
    }

    prevRow.push(1);
  }

  return prevRow;
};