const fs = require('fs');
let input = fs.readFileSync(0).toString().split('\n');
const [n,m] = input[0].split(' ').map(e=>Number(e));
let parents = Array.from({length:n+1},(v,i)=>i);
function union(a,b){
    a = find(a);
    b = find(b);
    if(a<b){
        parents[b] = a;
    }else{
        parents[a] = b;
    }
}
function find(a){
    if(parents[a]===a) return a;
    return parents[a] = find(parents[a]);
}
for(let i = 0; i<m; i++){
    const [a,b,c] = input[i+1].split(' ').map(e=>Number(e));
    if(a===0){
        union(b,c);
    }else{
        console.log(find(b)===find(c)?1:0);
    }
}