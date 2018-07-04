/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */
var findRestaurant = function(list1, list2) {
  var listMap = {};
  var shortList, longList;
  var minSum = Infinity;
  var result = [];

  if (list1.length < list2.length) {
    shortList = list1;
    longList = list2;
  } else {
    shortList = list2;
    longList = list1;
  }

  shortList.forEach(function(name, index) {
    listMap[name] = index;
  });

  longList.forEach(function (name, index) {
    if (listMap.hasOwnProperty(name)) {
      var sum = index + listMap[name];

      if (sum < minSum) {
        result = [name];
        minSum = sum;
      } else if (sum === minSum) {
        result.push(name);
      }
    }
  });

  return result;
};