/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    var carry = 0;
    digits[digits.length - 1] += 1;
    for (var i = digits.length - 1; i >= 0; i--) {
        var sum = digits[i] + carry;
        digits[i] = sum % 10;
        carry = Math.floor(sum / 10);

        if (carry === 0) {
            return digits;
        }
    }

    if (carry > 0) {
        digits.splice(0, 0, carry)
    }

    return digits
};