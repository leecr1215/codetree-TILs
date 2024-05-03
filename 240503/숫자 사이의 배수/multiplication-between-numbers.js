const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let sum = 0;
let cnt = 0;

for(let i = a; i <= b; i++){
    if(i % 5 === 0 || i % 7 === 0){
        sum += i;
        cnt++;
    }
}

console.log(sum, (sum/cnt).toFixed(1))