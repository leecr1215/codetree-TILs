const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

console.log(input[0].split('').reverse().splice(0,Number(input[1])).join(''));