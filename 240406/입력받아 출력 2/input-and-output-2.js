const fs = require('fs');
const [birth, userId] = fs.readFileSync(0).toString().split('-');

console.log(`${birth}${userId}`);