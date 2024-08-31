const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n').map(Number).slice(1);

const leftShift = (str) => {
    return str.slice(1) + str[0];
}

const sum = input.reduce((acc, cur)=>acc+cur, 0);

console.log(leftShift(sum+''));