const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);
const nums = input[1].split(' ').map(Number);

nums.sort((a, b) => b-a);

console.log(nums[0], nums[1]);