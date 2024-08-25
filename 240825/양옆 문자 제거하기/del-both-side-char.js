const fs = require('fs');
let str = fs.readFileSync(0).toString().trim();
const len = str.length;

str = str.split('').filter((alpha, idx) => idx !== 1 && idx !== len-2).join("");

console.log(str);