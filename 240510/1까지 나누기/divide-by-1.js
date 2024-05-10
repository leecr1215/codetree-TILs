const fs = require('fs');
let n = Number(fs.readFileSync(0).toString().trim());
const MAX_N = 5000;

let cnt = 0;

for(let i = 1; i <= MAX_N; i++){
    cnt++;
    n = parseInt(n / i);

    if(n <= 1) break;
}

console.log(cnt);