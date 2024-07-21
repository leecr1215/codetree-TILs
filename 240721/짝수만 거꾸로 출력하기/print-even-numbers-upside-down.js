const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);
const arr = input[1].split(' ').map(Number);

for(let i = n-1; i >= 0; i--){
    if(arr[i] % 2 === 0){
        process.stdout.write(arr[i] + " ");
    }
}