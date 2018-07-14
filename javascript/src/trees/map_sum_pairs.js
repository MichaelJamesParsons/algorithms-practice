/**
 * Initialize your data structure here.
 */
var MapSum = function(key, weight) {
  this.key = key;
  this.weight = weight;
  this.children = {};
};

/**
 * @param {string} key
 * @param {number} val
 * @return {void}
 */
MapSum.prototype.insert = function(key, val) {
  var node = this;
  for (var x = 0; x < key.length; x++) {
    if (!node.children.hasOwnProperty(key.charAt(x))) {
      node.children[key.charAt(x)] = new MapSum(key.charAt(x), 0);
    }

    node = node.children[key.charAt(x)];
  }

  node.weight = val;
};

/**
 * @param {string} prefix
 * @return {number}
 */
MapSum.prototype.sum = function(prefix) {
  var node = this;
  for (var x = 0; x < prefix.length; x++) {
    if (!node.children.hasOwnProperty(prefix.charAt(x))) {
      return 0;
    }

    node = node.children[prefix.charAt(x)];
  }

  return node.sumTree();
};

MapSum.prototype.sumTree = function () {
  var self = this;
  return Object.keys(this.children).reduce(function (sum, index) {
      return sum + self.children[index].sumTree();
  }, this.weight);
};

/**
 * Your MapSum object will be instantiated and called as such:
 * var obj = Object.create(MapSum).createNew()
 * obj.insert(key,val)
 * var param_2 = obj.sum(prefix)
 */