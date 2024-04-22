const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

let result = '';

for(let i = a; i <= b; i++){
    if(i % 2 !== 0){
        result += i + ' ';
    }
}

console.log(result);