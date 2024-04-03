const fs = require('fs');

const n = Number(fs.readFileSync(0).toString());

console.log((n * 30.48).toFixed(1));