const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split('\n').map(Number);

let cnt = 0;

nums.forEach((num)=>{
    if(num % 2 === 0) cnt++;
});

console.log(cnt);