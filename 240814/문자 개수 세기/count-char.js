const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const str = input[0];
const alpha = input[1];

console.log(str.replaceAll(' ', '').split(alpha).length-1);