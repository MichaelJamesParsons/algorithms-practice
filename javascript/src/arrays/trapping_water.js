/**
 * @param {number[]} heights
 * @return {number}
 */
var trap = function(heights) {
  var maxHeightIndex;
  var postMaxHeightSum;
  var ptr;
  var sum = 0;

  for (var x = 0; x < heights.length - 1; x++) {
    ptr = x + 1;
    maxHeightIndex = ptr;
    postMaxHeightSum = 0;

    while (ptr < heights.length && heights[ptr] < heights[x]) {
      sum += heights[x] - heights[ptr];
      postMaxHeightSum += heights[x] - heights[ptr];

      if (heights[ptr] > heights[maxHeightIndex] || ptr === maxHeightIndex) {
        maxHeightIndex = ptr;
        postMaxHeightSum = 0;
      }

      ptr++;
    }

    if (ptr >= heights.length && heights[maxHeightIndex] < heights[x]) {
      sum -= ((maxHeightIndex - x) * (heights[x] - heights[maxHeightIndex]) + postMaxHeightSum);
      ptr = maxHeightIndex;

      if (heights[maxHeightIndex] === 0) {
        return sum;
      }
    }

    x = ptr - 1
  }

  return sum;
};