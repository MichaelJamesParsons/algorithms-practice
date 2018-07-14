/**
 * Initialize your data structure here.
 */
var Trie = function() {
  this.root = {
    prefix: "",
    children: {},
    isWord: false
  }
};

/**
 * Inserts a word into the trie.
 * @param {string} word
 * @return {void}
 */
Trie.prototype.insert = function(word) {
  var node = this.root;
  for (var x = 0; x < word.length; x++) {
    if (!node.children.hasOwnProperty(word.charAt(x))) {
      node.children[word.charAt(x)] = {
        prefix: word.charAt(x),
        children: {},
        isWord: false
      }
    }

    node = node.children[word.charAt(x)];
  }

  node.isWord = true;
};

/**
 * Returns if the word is in the trie.
 * @param {string} word
 * @return {boolean}
 */
Trie.prototype.search = function(word) {
  var node = this.root
  for (var x = 0; x < word.length; x++) {
    if (!node.children.hasOwnProperty(word.charAt(x))) {
      return false;
    }

    node = node.children[word.charAt(x)];
  }

  return node.isWord;
};

/**
 * Returns if there is any word in the trie that starts with the given prefix.
 * @param {string} prefix
 * @return {boolean}
 */
Trie.prototype.startsWith = function(prefix) {
  var node = this.root;
  for (var x = 0; x < prefix.length; x++) {
    if (!node.children.hasOwnProperty(prefix.charAt(x))) {
      return false;
    }

    node = node.children[prefix.charAt(x)];
  }

  return true;
};

/**
 * Your Trie object will be instantiated and called as such:
 * var obj = Object.create(Trie).createNew()
 * obj.insert(word)
 * var param_2 = obj.search(word)
 * var param_3 = obj.startsWith(prefix)
 */