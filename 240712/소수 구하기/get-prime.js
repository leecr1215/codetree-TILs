const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

const isPrimeNumber = (num) => {
    for(let i = 2; i <= parseInt(Math.sqrt(num)); i++){
        if(num % i === 0){
            return false;
        }
    }
    return true;
}

for(let i = 2; i <= n; i++){
    if(isPrimeNumber(i)) process.stdout.write(i + " ");
}