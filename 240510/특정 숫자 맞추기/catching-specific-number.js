const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split('\n').map(Number);

let idx = 0;
while(true){
    if(nums[idx] === 25) break;

    if(nums[idx] < 25) console.log("Higher");
    else console.log("Lower");

    idx++;
}

console.log("Good");