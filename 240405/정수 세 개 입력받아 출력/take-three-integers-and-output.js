const fs = require('fs');
const [a, b, c] = fs.readFileSync(0).toString().split(/\s+/);
console.log(a, b, c);