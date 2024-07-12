const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(Number);

console.log(arr.reduce((acc, cur)=>acc + cur, 0));