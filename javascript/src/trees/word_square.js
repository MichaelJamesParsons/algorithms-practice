var Trie = function () {
  this.words = new Map();
}

Trie.prototype.addWords = function (words) {
  for (var x = 0; x < words.length; x++) {
    this.addWord(words[x]);
  }
}

Trie.prototype.addWord = function (word) {
  var ptr = this.words;
  for (var c = 0; c < word.length; c++) {
    var char = word[c];
    if (!ptr.has(char)) {
      ptr.set(char, new Map());
    }

    ptr = ptr.get(char);
  }
}

Trie.prototype.findPrefix = function (prefix) {
  var ptr = this.words;
  for (char of prefix) {
    if (!ptr.has(char)) {
      return null;
    }

    ptr = ptr.get(char);
  }

  return ptr;
}

/**
 * @param {string[]} words
 * @return {string[][]}
 */
var wordSquares = function(words) {
  var trie = new Trie();
  trie.addWords(words);

  var result = new Array(words[0].length).fill(null).map(() => {
    return new Array(words[0].length).fill(null);
});


  return findWordSquare(trie, trie, 0, 0, result);
};

function findWordSquare (trie, ptr, row, col, result) {
  for (var [key, value] of ptr) {
    if (row === 0) {
      result[row][col] = key;
      traverse(trie, value, row, col + 1, result);
    } else {

    }
  }
}