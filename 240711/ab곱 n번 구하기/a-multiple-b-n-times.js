const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split('\n');
const n = Number(arr[0]);

for(let i = 1; i <= Number(n); i++){
    const [a, b] = arr[i].split(' ').map(Number);
    
    let sum = 1;
    for(let j = a; j <= b; j++){
        sum *= j;
    }
    console.log(sum);
}