const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
const n = Number(input[0]);

let cnt = 0;
for(let i = 1; i <= n; i++){
    if(input[i][0] === 'a'){
        cnt++;
    }
}

console.log(input.splice(1).join('').length, cnt);