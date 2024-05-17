const fs = require('fs');
const [a, b, c] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let hasMultiplesOfC = false;
for(let i = a; i <= b; i++){
    if(i % c === 0){
        hasMultiplesOfC = true;
        break;
    }
}

console.log(hasMultiplesOfC ? "NO" : "YES");