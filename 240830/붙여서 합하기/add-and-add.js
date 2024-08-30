const fs = require('fs');
const [A, B] = fs.readFileSync(0).toString().trim().split(' ');

console.log(Number(A+B) + Number(B+A));