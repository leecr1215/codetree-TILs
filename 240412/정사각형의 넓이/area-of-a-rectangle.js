const fs = require('fs');
const n = Number(fs.readFileSync(0).toString());

console.log(n**2);
if(n < 5) console.log('tiny');