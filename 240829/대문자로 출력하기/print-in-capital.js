const fs = require('fs');
const str = fs.readFileSync(0).toString().trim().replaceAll(/[^a-zA-Z]/g, '');

console.log(str.toUpperCase());