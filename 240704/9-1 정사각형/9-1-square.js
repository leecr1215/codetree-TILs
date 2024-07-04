const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

const nums = new Array(9).fill().map((_,i) => i+1).reverse();

let cnt = 0;

for(let i = 0; i < n; i++){
    let str = "";
    for(let j = 0; j < n; j++){
        str += nums[cnt % 9];
        cnt++;
    }
    console.log(str);
}