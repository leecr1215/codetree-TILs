const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split('\n').map(Number);

let cnt = 0;
let sum = 0;

nums.forEach((num)=>{
    if(num >= 0 && num <= 200){
        cnt++;
        sum += num;
    }
})

console.log(sum, (sum/cnt).toFixed(1));