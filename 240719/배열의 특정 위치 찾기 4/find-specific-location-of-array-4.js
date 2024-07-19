const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let cnt = 0;
let sum = 0;

for(let i = 0; i < 10; i++){
    if(input[i]==0) break;

    if(input[i] % 2 === 0){
        cnt++;
        sum += input[i];
    }
}

console.log(cnt, sum);