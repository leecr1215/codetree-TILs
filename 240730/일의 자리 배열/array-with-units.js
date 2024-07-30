const fs = require('fs');
let [pp, p] = fs.readFileSync(0).toString().trim().split(' ').map(Number);


for(let i = 3; i <= 12; i++){
    process.stdout.write(pp+' ');

    let temp = (pp + p) % 10;
    pp = p;
    p = temp;
}