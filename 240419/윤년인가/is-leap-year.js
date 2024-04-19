const fs = require('fs');

const year = Number(fs.readFileSync(0).toString());

function isLeapYear(year){
    if(year % 100 === 0 && year % 400 !== 0){
        return false;
    }

    if(year % 4 === 0) return true;

    return false;
}

console.log(isLeapYear(year));