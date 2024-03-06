const fs = require("fs");
let input = fs.readFileSync(0).toString().split('\n');
const [n,m] = input[0].split(' ').map(e=>Number(e));
let adj = Array.from({length:n+1},()=>[]);
for(let i = 1; i<=m; i++){
    let [a,b] = input[i].split(' ').map(e=>Number(e));
    adj[a].push(b);
    adj[b].push(a);
}
let answer = 0;
let visited = Array.from({length:n+1},()=>false);
function dfs(n){
    answer++;
    visited[n] = true;
    for(let e of adj[n]){
        if(visited[e]) continue;
        dfs(e);
    }
}
dfs(1);
console.log(answer-1);