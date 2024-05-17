const fs = require('fs');
const [a, b, c] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let check = 'NO';

for(let i = a; i <= b; i++){
    if(i % c === 0){
        check = 'YES';
        break;
    }
}

console.log(check);