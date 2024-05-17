const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let isCompositeNum = false;

for(let i = 2; i < n; i++){
    if(n % i === 0){
        isCompositeNum = true;
        break;
    }
}

console.log(isCompositeNum ? 'C' : 'N');