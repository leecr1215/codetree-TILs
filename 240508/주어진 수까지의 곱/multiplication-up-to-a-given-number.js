const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let result = a;

for(let i = a + 1; i <= b; i++){
    result *= i;
}

console.log(result);