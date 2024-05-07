const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split("\n").map(Number);

let sum = 0;
for(let i = 1; i < arr.length; i++){
    sum += arr[i];
}
console.log(sum, sum / arr[0]);