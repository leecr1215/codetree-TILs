const fs = require('fs');
const A = fs.readFileSync(0).toString().trim().replaceAll(/[^0-9]/g, '');

console.log(A.split('').reduce((acc, cur) => Number(cur) + Number(acc), 0));