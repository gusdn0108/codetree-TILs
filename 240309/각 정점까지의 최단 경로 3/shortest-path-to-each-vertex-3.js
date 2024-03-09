const fs = require('fs');

class PriorityQueue{
    constructor(){
        this.data = [];
    }
    enqueue(e){
        this.data.push(e);
        this.data.sort((a,b)=>b[1]-a[1]);
    }
    dequeue(){
        return this.data.shift();
    }
    isEmpty(){
        return this.data.length===0;
    }
}

let input = fs.readFileSync(0).toString().split('\n');
const [n,m] = input[0].split(' ').map(e=>Number(e));
let adj = Array.from({length:n+1},()=>[]);
for(let i = 1; i<=m; i++){
    const [a,b,c] = input[i].split(' ').map(e=>Number(e));
    adj[a].push([b,c]);
}
let answer = Number.MAX_SAFE_INTEGER;
let distance = Array.from({length:n+1},()=>Number.MAX_SAFE_INTEGER);
function dijkstra(n){
    let queue = new PriorityQueue();

    queue.enqueue([1,0]);
    distance[1] = 0;
    while(!queue.isEmpty()){
        const [now,dist] = queue.dequeue();
        if(distance[now]<dist) continue;

        for(let e of adj[now]){
            let cost = dist + e[1];
            if(cost<distance[e[0]]){
                queue.enqueue([e[0],cost]);
                distance[e[0]] = cost;
            }
        }
    }
}
dijkstra(1);
for(let i = 2; i<=n; i++){
    console.log(distance[i]===Number.MAX_SAFE_INTEGER?-1:distance[i]);
}