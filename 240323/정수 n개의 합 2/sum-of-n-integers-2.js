const fs = require('fs');
const input = fs.readFileSync(0).toString().split('\n');
const [n,k] = input[0].split(' ').map(e=>Number(e));
const arr = input[1].split(' ').map(e=>Number(e));
let prefixSum = Array.from({length:n},()=>0);
prefixSum[0] = arr[0];
let answer = 0;
for(let i = 1; i<n;i++){
    prefixSum[i] = prefixSum[i-1]+arr[i];
}
for(let i = k; i<n; i++){
    answer = Math.max(answer,prefixSum[i]-prefixSum[i-k]);
}
console.log(answer);