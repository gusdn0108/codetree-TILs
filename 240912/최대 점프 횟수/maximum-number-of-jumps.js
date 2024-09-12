const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const N = Number(input[0]);
const arr = input[1].split(' ').map(Number);

const dp = new Array(N).fill(0);

for (let i = 0; i < N; i++) {
    for (let j = 1; j <= arr[i]; j++) {
        if (i + j >= N) continue;
        if (arr[i + j] === 0) continue;
        dp[i + j] = Math.max(dp[i + j], dp[i] + 1);
    }
}

console.log(Math.max(...dp));