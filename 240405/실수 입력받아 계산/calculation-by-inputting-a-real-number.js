const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split("\n").map(str => Number(str));

console.log((a + b).toFixed(2));