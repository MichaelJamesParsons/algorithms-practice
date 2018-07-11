/**
 * @param {number[]} flowers
 * @param {number} k
 * @return {number}
 */
var kEmptySlots = function(flowers, k) {
  var bloomed = new Array(flowers.length).fill(false);

  for (var x = 0; x < flowers.length; x++) {
    var bloomedIndex = flowers[x] - 1;
    bloomed[bloomedIndex] = true;

    var prev = isRangeEmpty(bloomedIndex - k - 1, bloomedIndex, flowers, bloomed);

    if (prev) {
      return x + 1;
    }

    var next = isRangeEmpty(bloomedIndex, bloomedIndex + k + 1, flowers, bloomed);

    if (next) {
      return x + 1;
    }
  }

  return -1;
};

var isRangeEmpty = function (min, max, flowers, bloomed) {
  if (min < 0 || max >= flowers.length || !bloomed[min] || !bloomed[max]) {
    return false;
  }

  for (var x = min + 1; x < max; x++) {
    if (bloomed[x]) {
      return false;
    }
  }

  return true;
};