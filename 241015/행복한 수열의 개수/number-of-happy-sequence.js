const fs = require('fs');
const input = fs.readFileSync(0).toString().split('\n');
const [N, M] = input[0].split(' ').map(Number);
const arr = input.slice(1).map(line => line.split(' ').map(Number));
let answer = 0;

for (let i = 0; i < N; i++) {
    let re = 0;
    for (let j = 0; j < N; j++) {
        if (arr[i][j] == arr[i][j - 1]) {
            re = re === 0 ? 2 : re++;
        } else {
            re = 0;
        }
        if (re >= M) {
            answer++;
            break;
        }
    }
}

for (let i = 0; i < N; i++) {
    let re = 0;
    for (let j = 0; j < N; j++) {
        if (j - 1 < 0) continue;
        if (arr[j][i] == arr[j - 1][i]) {
            re = re === 0 ? 2 : re++;
        } else {
            re = 0;
        }
        if (re >= M) {
            answer++;
            break;
        }
    }
}
console.log(answer);