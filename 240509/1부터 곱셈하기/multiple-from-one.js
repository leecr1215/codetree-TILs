const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let multi = 1;
for(let i = 1; i <= 10; i++){
    multi *= i;

    if(multi >= n){
        console.log(i);
        break;
    }
}