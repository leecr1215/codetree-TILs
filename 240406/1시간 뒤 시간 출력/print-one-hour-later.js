const fs = require('fs');
const [hour, minute] = fs.readFileSync(0).toString().trim().split(':').map(Number);

console.log(`${hour+1}:${minute}`);