const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(" ").map(Number);

console.log(((a+b) / (a-b)).toFixed(2));