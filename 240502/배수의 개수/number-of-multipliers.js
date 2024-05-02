const fs = require('fs');
const nums = fs.readFileSync(0).toString().split('\n').map(Number);

let cnt1 = 0;
let cnt2 = 0;

for(let i = 0; i < 10; i++){
    
    if(nums[i] % 3 === 0) cnt1++;
    if(nums[i] % 5 === 0) cnt2++;
}

console.log(cnt1 + " " + cnt2);