const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 11; i < 11 + 2*n; i+=2){
    let str = "";
    for(let j = i; j < i + 2*n; j+=2){
        str += j + " ";
    }
    console.log(str);
}