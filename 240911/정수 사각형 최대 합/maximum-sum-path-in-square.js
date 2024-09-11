const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const N = Number(input[0]);
const arr = input.slice(1).map(e => e.split(' ').map(el => Number(el)));
const dp = Array.from({ length: N }, () => new Array(N));

for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
        if (i === 0) {
            dp[i][j] = arr[i][j];
        } else if (j === 0) {
            dp[i][j] = dp[i - 1][j] + arr[i][j];
        }
        else {
            dp[i][j] = Math.max(dp[i - 1][j] + arr[i][j], dp[i][j - 1] + arr[i][j]);
        }
    }
}

console.log(dp[N-1][N-1]);