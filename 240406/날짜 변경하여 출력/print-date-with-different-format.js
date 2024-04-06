const fs = require('fs');
const [yyyy, mm, dd] = fs.readFileSync(0).toString().split('.');

console.log(`${mm}-${dd}-${yyyy}`);