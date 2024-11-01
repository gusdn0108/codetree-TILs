const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const N = Number(input[0]);
const arr = input.slice(1).map(e => e.split(' ').map(el => Number(el)));
const dp = Array.from({ length: N }, () => Array.from({ length: N }, () => 1));

const dx = [-1, 0, 1, 0];
const dy = [0, 1, 0, -1];

function isOutOfRange(x, y) {
    return x < 0 || x >= N || y < 0 || y >= N;
}

let result = 0;
for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
        for (let k = 0; k < N; k++) {
            const nx = i + dx[k];
            const ny = j + dy[k];
            if (isOutOfRange(nx, ny)) continue;
            if (arr[nx][ny] < arr[i][j]) {
                dp[i][j] = Math.max(dp[i][j], dp[nx][ny] + 1);
                result = Math.max(result, dp[i][j]);
            } else if (arr[i][j] < arr[nx][ny]) {
                dp[nx][ny] = Math.max(dp[i][j] + 1, dp[nx][ny]);
                result = Math.max(dp[nx][ny], result);
            }
        }
    }
}

// for(let i = 0; i<N; i++){
//     for(let j = 0; j<N; j++){
//         process.stdout.write(dp[i][j]+" ");
//     }
//     console.log();
// }

console.log(result);