/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
  var count = 0;
  for (var i = 0; i < grid.length; i++) {
    for (var j = 0; j < grid[0].length; j++) {
      if (grid[i][j] === "1") {
        bfs(i, j, grid);
        count++;
      }
    }
  }

  return count;
};

var bfs = function (i, j, grid) {
  if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] === "0") {
    return;
  }

  grid[i][j] = "0";

  bfs(i - 1, j, grid);
  bfs(i + 1, j, grid);
  bfs(i, j - 1, grid);
  bfs(i, j + 1, grid);
};