const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let sum = 0;
const min = Math.min(a, b);
const max = Math.max(a, b);

for(let i = min; i <= max; i++){
    if(i % 5 === 0) sum += i;
}

console.log(sum);