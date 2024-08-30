const fs = require('fs');
const [str1, str2] = fs.readFileSync(0).toString().trim().split('\n');

const num1 = str1.replaceAll(/[^0-9]/g,'');
const num2 = str2.replaceAll(/[^0-9]/g,'');

console.log(Number(num1)+Number(num2));