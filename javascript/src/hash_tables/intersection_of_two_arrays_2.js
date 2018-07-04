/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
  var map = {};
  var results = [];

  nums1.forEach(function (num) {
    if (map.hasOwnProperty(num)) {
      map[num].list1++;
    } else {
      map[num] = { list1: 1, list2: 0 }
    }
  });

  nums2.forEach(function (num) {
    if (map.hasOwnProperty(num)) {
      if (map[num].list2 < map[num].list1) {
        results.push(num);
      }

      map[num].list2++;
    }
  });

  return results;
};