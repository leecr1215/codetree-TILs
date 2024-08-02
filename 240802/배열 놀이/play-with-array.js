const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const [n, q] = input[0].split(' ').map(Number);
const nums = input[1].split(' ').map(Number);

for(let i = 0; i < q; i++){
    const [num, value1, value2] = input[2 + i].split(' ').map(Number);

    if(num === 1){
        console.log(nums[value1-1]);
    }else if(num === 2){
        nums.indexOf(value1) === -1 ? console.log(0) : console.log(nums.indexOf(value1)+1);
    }else{
        console.log(nums.slice(value1-1, value2).join(' '));
    }
}