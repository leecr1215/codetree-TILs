const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split('\n').map(Number);

let sum = 0;
for(let i = 1; i <= arr[0]; i++){
    if(arr[i] % 2 !== 0 && arr[i] % 3 === 0){
        sum += arr[i];
    }
}

console.log(sum);