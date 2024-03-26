const fs = require('fs');
const input = fs.readFileSync(0).toString().split('\n');
const [n, m] = input[0].split(' ').map(e => Number(e));
let parents = Array.from({ length: n + 1 }, (v, i) => i);
function union(a, b) {
    a = find(a);
    b = find(b);
    if (a < b) {
        parents[b] = a;
    } else {
        parents[a] = b;
    }
}
function find(a){
    if(parents[a]===a){
        return a;
    }
    return parents[a] = find(parents[a]);
}
let li = [];
for (let i = 0; i < m; i++) {
    const [a,b,c] = input[i+1].split(' ').map(e=>Number(e));
    li.push([a,b,c]);
}
li.sort((a,b)=>a[2]-b[2]);
let answer = 0;
for(const [a,b,c] of li){
    if(find(a)===find(b)) continue;
    union(a,b);
    answer+=c;
}
console.log(answer);