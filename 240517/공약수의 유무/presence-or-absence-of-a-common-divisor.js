const fs = require('fs');

const [a, b] = fs.readFileSync(0).toString().trim().split(" ").map(Number);

let check = false;
for(let i = a; i <= b; i++){
    if(1920 % i == 0 && 2880 % i == 0){
        check = true;
    }
}
console.log(Number(check));