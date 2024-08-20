const fs = require('fs');
const [A, B] = fs.readFileSync(0).toString().trim().split('\n');

console.log(A+B === B+A);