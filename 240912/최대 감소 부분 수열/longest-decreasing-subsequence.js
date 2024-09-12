const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const N = Number(input[0]);
const arr = input[1].split(' ').map(Number);

const dp = Array.from({ length: N }, () => 1);
for (let i = 0; i < N; i++) {
    for (let j = 0; j < i; j++) {
        if (arr[i] < arr[j]) {
            dp[i] = Math.max(dp[i], dp[j] + 1);
        }
    }
}
console.log(Math.max(...dp));