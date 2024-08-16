const fs = require('fs');

console.log(fs.readFileSync(0).toString().trim().replaceAll(' ', '').length);