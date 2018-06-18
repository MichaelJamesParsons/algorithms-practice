/**
 * @param {number[]} A
 * @return {number}
 */
var peakIndexInMountainArray = function(A) {
    for (var x = 0; x < A.length - 1; x++) {
        if (A[x] > A[x+1]) {
            return x
        }
    }

    return A.length - 1
};