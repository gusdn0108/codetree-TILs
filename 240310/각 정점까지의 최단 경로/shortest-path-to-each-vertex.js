const fs = require('fs');
const input = fs.readFileSync(0).toString().split('\n');
const [n,m] = input[0].split(' ').map(e=>Number(e));
const k = Number(input[1]);
let adj = Array.from({length:n+1},()=>[]);
for(let i = 2; i<m+2;i++){
    const [a,b,c] = input[i].split(' ').map(e=>Number(e));
    adj[a].push([b,c]);
    adj[b].push([a,c]);
}

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
let distance = Array.from({length:n+1},()=>Number.MAX_SAFE_INTEGER);
function dijkstra(start){
    let pq = new PriorityQueue();
    
    pq.enqueue([start,0]);
    distance[start] = 0;
    while(!pq.isEmpty()){
        const [now,dist] = pq.dequeue();
        if(distance[now]<dist) continue;
        for(let e of adj[now]){
            let cost = dist+e[1];
            if(cost<distance[e[0]]){
                distance[e[0]] = cost;
                pq.enqueue([e[0],cost]);
            }
        }
    }
    
}
dijkstra(k);
console.log(distance.slice(1).join('\n'));