const fs = require("fs");
let input = fs.readFileSync(0).toString().split('\n');
const n = Number(input[0]);
let arr = input[1].split(' ').map(e=>Number(e));
let dp = Array.from({length:n},()=>1);
for(let i = 0; i<n; i++){
    for(let j = 0; j<i; j++){
        if(arr[j]<arr[i]){
            dp[i] = Math.max(dp[j]+1,dp[i]);
        }
    }
}
console.log(Math.max(...dp));