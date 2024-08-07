const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

input.forEach((row)=>{
    console.log(row.split(' ').map((alpha) => alpha.toUpperCase()).join(' '));
});