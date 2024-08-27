const fs = require('fs');
let str = fs.readFileSync(0).toString().trim();
const L = str.length;

console.log(str);

for(let i = 0; i < L; i++){
    str = shiftRight(str);
    console.log(str);
}

function shiftRight(str){
    return str.slice(-1) + str.slice(0,-1);
}