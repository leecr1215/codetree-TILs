const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);
const nums = input[1].split(' ').map(Number);

const count = Array(10).fill(0);

nums.forEach((num)=>{
    count[num]++;
})

count.slice(1).forEach(cnt => {
    console.log(cnt);
})