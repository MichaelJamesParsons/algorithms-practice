var wallsAndGates = function (rooms) {
  for (var i = 0; i < rooms.length; i++) {
    for (var j = 0; j < rooms[0].length; j++) {
      if (rooms[i][j] === 0) {
        bfs(i, j, rooms);
      }
    }
  }
};

var bfs = function (i, j, rooms) {
  var moves = [
    [-1, 0],
    [0, 1],
    [1, 0],
    [0, -1]
  ];

  var stack = [];
  stack.push([i, j, 0]);

  while (stack.length > 0) {
    var cell = stack.shift();
    rooms[cell[0]][cell[1]] = cell[2];

    for (var x = 0; x < moves.length; x++) {
      var row = cell[0] + moves[x][0];
      var col = cell[1] + moves[x][1];

      if (row < rooms.length && row >= 0
          && col < rooms[0].length && col >= 0
          && rooms[row][col] !== -1
          && rooms[row][col] !== 0
          && (rooms[row][col] === 2147483647 || rooms[row][col] > cell[2])) {
        stack.push([row, col, cell[2] + 1]);
      }
    }
  }
};
