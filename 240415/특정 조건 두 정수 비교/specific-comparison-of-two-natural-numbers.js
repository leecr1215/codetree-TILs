const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(" ").map(Number);

let result1;
let result2;

if(a < b){
    result1 = 1;
}else{
    result1 = 0;
}


if(a === b){
    result2 = 1;
}else{
    result2 = 0;
}

console.log(result1, result2);