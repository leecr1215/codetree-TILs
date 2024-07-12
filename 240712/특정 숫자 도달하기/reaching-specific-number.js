const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let sum = 0;
let cnt = 0;

for(let i = 0; i < 10; i++){
    if(arr[i] < 250){
        cnt++;
        sum += arr[i];
    }
    else{
        break;
    }

}

console.log(sum, Math.round(sum / cnt * 10) /  10);