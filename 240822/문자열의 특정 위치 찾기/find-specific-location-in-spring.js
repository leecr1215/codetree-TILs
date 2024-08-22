const fs = require('fs');
const [str, alpha] = fs.readFileSync(0).toString().trim().split(" ");

console.log(str.indexOf(alpha) === -1 ? "No" : str.indexOf(alpha));