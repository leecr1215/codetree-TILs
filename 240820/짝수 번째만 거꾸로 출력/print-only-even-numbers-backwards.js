const fs = require('fs');

console.log(fs.readFileSync(0).toString().trim().split('').filter((_, idx)=>idx % 2 !== 0).reverse().join(''));