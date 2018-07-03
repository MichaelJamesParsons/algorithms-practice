/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
  if (nums1.length === 0 || nums2.length === 0) {
    return [];
  }

  var seen = {};

  nums1.forEach(function(num) {
    seen[num] = 1;
  });

  nums2.forEach(function(num) {
    if (seen.hasOwnProperty(num)) {
      seen[num] += 1;
    }
  });

  var result = [];
  Object.keys(seen).forEach(function (num) {
    if (seen[num] > 1) {
      result.push(parseInt(num));
    }
  });

  return result;
};