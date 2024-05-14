const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n").map(Number);

let cnt = 0;
let idx = 0;

let sum = 0;

while(true){
    if(input[idx] < 20 || input[idx] > 29) break;

    sum += input[idx];

    cnt++;
    idx++;
}

console.log((sum / idx).toFixed(2));