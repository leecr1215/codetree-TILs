const fs = require('fs');
const input = fs.readFileSync(0).toString();

let [a, b] = input.split(" ").map(str => Number(str));

[b, a] = [a, b];

console.log(a, b);