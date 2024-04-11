const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

const sum = a + b;
const average = (a + b)/2;

console.log(sum, average.toFixed(1));