const fs = require('fs');
const arr = fs.readFileSync(0).toString().split(" ").map(Number);

console.log(Math.max(...arr))