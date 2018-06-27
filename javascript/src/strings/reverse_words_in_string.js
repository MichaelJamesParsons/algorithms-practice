/**
 * @param {string} str
 * @returns {string}
 */
var reverseWords = function(str) {
    return str.split(' ').reverse().filter(function (word) {
      return word !== '';
    }).join(' ');
};