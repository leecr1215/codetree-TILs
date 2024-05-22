const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

function isDemical (number){
    for(let i = 2; i <= Math.sqrt(number); i++){
        if(number % i === 0){
            return false;
        }
    }
    return true;
}

const result = isDemical(n) ? 'P' : 'C';

console.log(result);