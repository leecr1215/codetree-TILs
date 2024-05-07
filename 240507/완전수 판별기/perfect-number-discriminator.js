const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let sum = 0;

for(let i = 1; i <= Math.ceil(Math.sqrt(n)); i++){
    if(n % i == 0){
        sum += i;
    } 
}

sum == n ? console.log('P') : console.log('N');