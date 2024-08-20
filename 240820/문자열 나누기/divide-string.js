const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");
const result = input[1].replaceAll(' ', '').split('');

let temp = '';
result.forEach((num, idx)=>{
    temp += num;

    if((idx+1) % 5 === 0){
        console.log(temp);
        temp = '';
    }
})

console.log(temp);