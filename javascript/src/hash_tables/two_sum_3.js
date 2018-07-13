/**
 * Initialize your data structure here.
 */
var TwoSum = function() {
  this.keys = {};
  this.values = [];
};

/**
 * Add the number to an internal data structure..
 * @param {number} number
 * @return {void}
 */
TwoSum.prototype.add = function(number) {
  if (!this.keys.hasOwnProperty(number)) {
    this.keys[number] = 1;
    this.values.push(number);
  } else {
    this.keys[number] += 1;
  }
};

/**
 * Find if there exists any pair of numbers which sum is equal to the value.
 * @param {number} value
 * @return {boolean}
 */
TwoSum.prototype.find = function(value) {
  if (this.values.length < 1) {
    return false;
  }

  for (var x = 0; x < this.values.length; x++) {
    var diff = value - this.values[x];
    if (this.keys.hasOwnProperty(diff) && (diff !== this.values[x] || this.keys[diff] > 1)) {
      return true;
    }
  }

  return false;
};

/**
 * Your TwoSum object will be instantiated and called as such:
 * var obj = Object.create(TwoSum).createNew()
 * obj.add(number)
 * var param_2 = obj.find(value)
 */