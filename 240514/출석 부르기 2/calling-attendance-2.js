const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split("\n").map(Number);

for(let i = 0; i < nums.length; i++){
    if(nums[i] === 1) console.log("John");
    else if(nums[i] === 2) console.log("Tom");
    else if(nums[i] === 3) console.log("Paul");
    else if(nums[i] === 4) console.log("Sam");
    else {
        console.log("Vacancy");
        break;
    }
}