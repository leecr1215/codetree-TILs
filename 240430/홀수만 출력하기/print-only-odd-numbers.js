const fs = require('fs');

const arr = fs.readFileSync(0).toString().split("\n").map(Number);

for(let i = 1; i <= arr[0]; i++){
    let num = arr[i];
    if(num % 2 != 0 && num % 3 == 0){
        console.log(num);
    }
}