const fs = require('fs');
const str = fs.readFileSync(0).toString().trim().replaceAll(/[^0-9a-zA-Z]/g, '');

console.log(str.toLowerCase());