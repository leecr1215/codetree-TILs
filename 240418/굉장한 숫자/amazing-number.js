const fs = require('fs');
const n = Number(fs.readFileSync(0).toString());

function isUbelievable(n){
    return isOddAndMultipleOfThree(n) || isEvenAndMultipleOfFive(n);
}

function isOddAndMultipleOfThree(n){
    return n % 2 != 0 && n % 3 == 0;
}

function isEvenAndMultipleOfFive(n){
    return n % 2 == 0 && n % 5 == 0;
}

console.log(isUbelievable(n));