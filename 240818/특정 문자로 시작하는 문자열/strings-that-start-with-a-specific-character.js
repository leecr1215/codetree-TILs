const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const n = Number(input[0]);
const alpha = input[n+1];
const strs = input.slice(1, n+1).filter((str)=>str[0]===alpha);

console.log(strs.length, (strs.join('').length / strs.length).toFixed(2));