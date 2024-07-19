const fs = require('fs');
const numbers = fs.readFileSync(0).toString().trim().split(' ').map(Number);

const arr = [];

for(let i = 0; i < 10; i++){
    if(numbers[i]===0) break;
    arr.unshift(numbers[i]);
}

arr.forEach((num)=>{
    process.stdout.write(num + ' ');
});