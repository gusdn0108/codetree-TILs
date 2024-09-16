const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ');

const K = Number(input[0]);
const N = Number(input[1]);
const answer = [];

function printArray() {
    console.log(answer.join(' '));
}
function choose(currentNumber) {
    if (currentNumber > N) {
        printArray();
        return;
    }
    for (let i = 1; i <= K; i++) {
        answer.push(i)
        choose(currentNumber + 1);
        answer.pop();
    }
}
choose(1);