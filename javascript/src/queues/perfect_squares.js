/**
 * Num squares solution.
 *
 * @param {number} n
 * @return {number}
 */
var numSquares = function(n) {
  var result = [];
  for (var i = 0; i <= n; i++) {
    result[i] = i;
    for (var j = 1; j * j < i; j++) {
      result[i] = Math.min(result[i], result[i - j * j] + 1);
    }
  }

  return result[n];
};


/**
 * Num squares solution using knapsack algorithm.
 *
 * @param {number} n
 * @return {number}
 */
var numSquaresKnapsack = function(n) {
  var squares = [];
  var x = 1;
  while (x * x <= n) {
    var square = x * x;
    for (var i = square; i <= n; i += square) {
      squares.push(square);
    }

    x++;
  }

  return knapsack(squares.length - 1, squares, n, 0);
};

var knapsack = function (index, squares, remaining, numSquares) {
  if (remaining === 0) {
    return numSquares;
  } else if (index < 0) {
    return Number.MAX_VALUE;
  }

  if (squares[index] > remaining) {
    return knapsack(index - 1, squares, remaining, numSquares);
  }

  var take = knapsack(index - 1, squares, remaining - squares[index], numSquares + 1);
  var skip = knapsack(index - 1, squares, remaining, numSquares);

  return Math.min(take, skip);
};