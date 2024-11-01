const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const N = Number(input[0]);
const arr = input.slice(1).map(e => e.split(' ').map(el => Number(el)));
const dp = Array.from({ length: N + 1 }, () => Array.from({ length: N }, () => 1));

const dx = [-1, 0, 1, 0];
const dy = [0, 1, 0, -1];
const cells = [];

function isOutOfRange(x, y) {
    return x < 0 || x >= N || y < 0 || y >= N;
}

for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
        cells.push([arr[i][j], i, j]);
    }
}
cells.sort((a, b) => a[0] - b[0]);

let result = 0;
cells.forEach(cell => {
    const [cur, x, y] = cell;
    for (let i = 0; i < 4; i++) {
        const nx = x + dx[i];
        const ny = y + dy[i];
        if (isOutOfRange(nx, ny)) continue;
        if (arr[x][y] < arr[nx][ny]) {
            dp[nx][ny] = Math.max(dp[nx][ny], dp[x][y] + 1);
        }
    }
})

for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
        result = Math.max(result, dp[i][j]);
    }
}

// for(let i = 0; i<N; i++){
//     for(let j = 0; j<N; j++){
//         process.stdout.write(dp[i][j]+" ");
//     }
//     console.log();
// }

console.log(result);