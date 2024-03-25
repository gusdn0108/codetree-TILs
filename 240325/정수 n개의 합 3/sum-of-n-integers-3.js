const fs = require('fs');
const input = fs.readFileSync(0).toString().split('\n');
const [n, k] = input[0].split(' ').map(e => Number(e));
let arr = Array.from({ length: k }, () => []);
for (let i = 0; i < n; i++) {
    arr[i] = input[1 + i].split(' ').map(e => Number(e));
}
let pre = Array.from({ length: n + 1 }, () => Array.from({ length: n + 1 }, () => 0));

for (let i = 1; i <= n; i++) {
    for (let j = 1; j <= n; j++) {
        pre[i][j] = pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1] + arr[i - 1][j - 1];
    }
}
let answer = 0;
for (let i = k; i <= n; i++) {
    for (let j = k; j <= n; j++) {
        let sum = pre[i][j] - pre[i - 1][j] - pre[i][j - 1] + pre[i - 1][j - 1];
        answer = Math.max(answer, sum);
    }
}
console.log(answer);