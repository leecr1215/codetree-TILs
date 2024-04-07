const fs = require('fs');
const phoneArr = fs.readFileSync(0).toString().split("-");
console.log(`${phoneArr[0]}-${phoneArr[2]}-${phoneArr[1]}`);