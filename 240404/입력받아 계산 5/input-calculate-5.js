const fs = require('fs');
const input = fs.readFileSync(0).toString();
const [a, b] = input.split(" ").map(str => Number(str));

console.log(a+b);