const fs = require('fs');

const str = fs.readFileSync(0).toString().trim().replace('e', '');

console.log(str);