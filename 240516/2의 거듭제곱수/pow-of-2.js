const fs = require('fs');
const N = Number(fs.readFileSync(0).toString().trim());

let num = 1;
let cnt = 0;

while(N != num){
    num = 2 * num;
    cnt++;
}

console.log(cnt);