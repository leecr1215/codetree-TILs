const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let evenSum = 0;

let mutiplesOfThreeSum = 0;
let cnt = 0;

arr.forEach((number, idx) => {
    if(idx % 2 !== 0){
        evenSum += number;
    }

    if((idx+1) % 3 === 0){
        cnt++;
        mutiplesOfThreeSum += number
    }
})

console.log(evenSum, (mutiplesOfThreeSum / cnt).toFixed(1));