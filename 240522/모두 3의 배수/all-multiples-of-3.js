const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split('\n').map(Number);

let result = true;

for(let i = 0; i < 5; i++){
    if(nums[i] % 3 !== 0) {
        result = false;
        break;
    }
}

console.log(Number(result));