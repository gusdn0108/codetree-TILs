const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const [N, M] = input[0].split(' ').map(Number);
const coins = input[1].split(' ').map(Number);
const dp = Array.from({ length: M + 1 }, () => Number.MAX_SAFE_INTEGER);

for (let i = 0; i < N; i++) {
    dp[coins[i]] = 1;
}

for (let i = 1; i <= M; i++) {
    for (let j = 0; j < N; j++) {
        if (i - coins[j] > 0)
            dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
    }
}

console.log(dp[M] !== Number.MAX_SAFE_INTEGER ? dp[M] : -1);