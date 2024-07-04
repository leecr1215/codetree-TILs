const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 1; i <= n; i++){
    let str = "";
    for(let j = n; j > 0; j--){
        str += i * j + " ";
    }
    console.log(str);
}