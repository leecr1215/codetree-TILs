const fs = require('fs');
const [a, b, c] = fs.readFileSync(0).toString().split(' ').map(Number);

const sum = a + b + c;
const average = (a + b + c) / 3;

console.log(sum);
console.log(average);
console.log(sum - average);