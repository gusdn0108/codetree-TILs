const fs = require("fs");
let input = fs.readFileSync(0).toString().split("\n");
let n = Number(input[0]);
let map = new Map();
for(let i = 1; i<=n; i++){
    let [command,a,b] =input[i].split(" ");
    if(command==="add"){
        map.set(a,b);
    }else if(command==="remove"){
        map.delete(a);
    }else{
        let target = map.get(a);
        console.log(target?target:"None");
    }
}