const fs = require('fs');
const input = fs.readFileSync(0).toString().split('\n');
const n = Number(input[0]);
const arr = input.slice(1).map(e => e.split(' ').map(Number));

const TYPE_WALL = 0;
const TYPE_PERSON = 1;
const TYPE_VISITED = 2;

const dx = [-1, 0, 1, 0];
const dy = [0, 1, 0, -1];

let villageCnt = 0;
let peopleCnt = 0;
const answerArr = [];

function dfs(x, y) {
    arr[x][y] = TYPE_VISITED;
    peopleCnt++;
    for (let i = 0; i < 4; i++) {
        const nx = x + dx[i];
        const ny = y + dy[i];
        if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
        if (arr[nx][ny] !== TYPE_PERSON) continue;
        dfs(nx, ny);
    }
}

for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
        if (arr[i][j] !== TYPE_PERSON) continue;
        villageCnt++;
        dfs(i, j);
        answerArr.push(peopleCnt);
        peopleCnt = 0;
    }
}

answerArr.sort((a, b) => a - b);
console.log(villageCnt);
console.log(answerArr.join('\n'));