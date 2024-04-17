const fs = require('fs');
const [a, b, c] = fs.readFileSync(0).toString().split(" ").map(Number);

console.log(Math.min(a, b, c));