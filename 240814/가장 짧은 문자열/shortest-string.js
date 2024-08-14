const fs = require('fs');
const strs = fs.readFileSync(0).toString().trim().split('\n');

let min = 20;
let max = 0;

strs.forEach((str)=>{
    const len = str.length;

    if(len < min){
        min = len;
    }

    if(len > max){
        max = len;
    }
})

console.log(max - min);