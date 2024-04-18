const fs = require('fs');
const [mid, fin] = fs.readFileSync(0).toString().split(' ').map(Number);

let award = 0;

if(mid >= 90){
    if(fin >= 95){
        award = 100000;
    }else if(fin >= 90){
        award = 50000;
    }
}

console.log(award);