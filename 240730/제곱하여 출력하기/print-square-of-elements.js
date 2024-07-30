const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const nums = input[1].split(' ');

nums.forEach((num)=>{
    process.stdout.write(Number(num) ** 2 + " ");
});