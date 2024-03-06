const fs = require("fs");
let input = fs.readFileSync(0).toString().split('\n');
let n = Number(input[0]);
let arr = input.slice(1).map(e=>e.split(" "));
const dx = [-1,-1,0,1,1,1,0,-1];
const dy = [0,1,1,1,0,-1,-1,-1];
let answer = 0;
for(let i = 1; i<n-1; i++){
    for(let j = 1; j<n-1; j++){
        let sum = Number(arr[i][j]);
        for(let k = 0; k<8; k++){
            let nx = i+dx[k];
            let ny = j+dy[k];
            sum+=Number(arr[nx][ny]);
        }
        answer = Math.max(answer,sum);
    }
}
console.log(answer);