const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

a = a + b;
b = a + b;

console.log(a, b);