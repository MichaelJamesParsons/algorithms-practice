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


/**
 * Alternative solution inspired by other users' submissions.
 *
 * @param {number[]} heights
 * @return {number}
 */
var trap2 = function(heights) {
  if (heights.length <= 1) {
    return 0;
  }

  var left = 0;
  var right = heights.length - 1;
  var minHeight = 0;
  var total = 0;

  while (left < right) {
    while (left < right && heights[left] <= minHeight) {
      total += minHeight - heights[left];
      left++;
    }

    while (left < right && heights[right] <= minHeight) {
      total += minHeight - heights[right];
      right--;
    }

    minHeight = Math.min(heights[left], heights[right]);
  }

  return total;
};