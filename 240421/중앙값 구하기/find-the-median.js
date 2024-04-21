const fs = require('fs');
const arr = fs.readFileSync(0).toString().split(" ").map(Number);

arr.sort((a, b) => a - b);

console.log(arr[1]);