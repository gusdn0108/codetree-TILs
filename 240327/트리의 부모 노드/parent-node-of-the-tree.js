let i = 0;
const fs = require('fs');
const input = fs.readFileSync(0).toString().split('\n');
const n = Number(input[0]);
let edges = Array.from({ length: n + 1 }, () => []);
let parents = Array.from({ length: n + 1 }, () => 0);
for (let i = 0; i < n - 1; i++) {
    const [n, m] = input[i + 1].split(' ').map(e => Number(e));
    edges[n].push(m);
    edges[m].push(n);
    parents[m] = n;
}
console.log(parents.slice(2).join('\n'));