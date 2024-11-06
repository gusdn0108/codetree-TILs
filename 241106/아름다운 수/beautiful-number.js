const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());
let answer = 0;

function rec(remain){
    if(remain === 0){
        answer++;
    }
    for(let i = 1; i <= Math.min(4, remain); i++){
        rec(remain - i);
    }
}
rec(n);
console.log(answer);