const fs = require('fs');

const n = Number(fs.readFileSync(0).toString());
const dp = Array.from({ length: n + 1 });
dp[0] = dp[1] = 1;

function getNumOfUniqBst(n) {
    let numOfUniqueBst = 0;
    for (let i = 0; i < n; i++) {
        numOfUniqueBst += dp[i] * dp[n - i - 1];
    }
    return numOfUniqueBst;
}

for(let i = 2; i<= n; i++){
    dp[i] = getNumOfUniqBst(i);
}

console.log(dp[n]);