const fs = require('fs');
let str = fs.readFileSync(0).toString().trim();

str = str.split('').map((alpha)=>alpha === str[1] ? str[0] : alpha).join("");

console.log(str);