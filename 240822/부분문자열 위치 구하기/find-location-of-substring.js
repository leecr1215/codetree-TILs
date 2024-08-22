const fs = require('fs');
const [str, target] = fs.readFileSync(0).toString().trim().split('\n');

console.log(str.indexOf(target));