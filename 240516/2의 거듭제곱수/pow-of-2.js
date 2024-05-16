const fs = require('fs');
const N = Number(fs.readFileSync(0).toString().trim());

console.log(Math.sqrt(N));