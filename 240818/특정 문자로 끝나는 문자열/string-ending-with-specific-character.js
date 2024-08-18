const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const strs = input.slice(0, -1);
const target = input[input.length-1];

strs.filter((str)=>str[str.length-1] === target).forEach((str)=>{
    console.log(str);
})