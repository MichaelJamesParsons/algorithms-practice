var MyHashMap = function() {
  this.map = [];
};

MyHashMap.prototype.put = function(key, value) {
  this.map[key] = value;
};

MyHashMap.prototype.get = function(key) {
  if (this.map.hasOwnProperty(key)) {
    return this.map[key];
  }

  return -1;
};

MyHashMap.prototype.remove = function(key) {
  delete this.map[key];
};