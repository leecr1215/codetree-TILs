const fs = require('fs');
const alpha = fs.readFileSync(0).toString().trim();

console.log(alpha == 'a' ? 'z' : String.fromCharCode(alpha.charCodeAt() - 1));