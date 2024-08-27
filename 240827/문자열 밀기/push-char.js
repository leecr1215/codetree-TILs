const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split('');
arr.push(arr.shift())
console.log(arr.join(''));