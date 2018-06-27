/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
  return s.split(' ').map(function (word) {
    return word.split('').reverse().join('')
  }).join(' ');
};