const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split('\n').map(Number);

for(let i = 0; i <= nums.length; i++){
    if(nums[i] === 0) break;

    console.log(nums[i]);
}