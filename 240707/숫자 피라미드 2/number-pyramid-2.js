const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let cnt = 1;
for(let i = 0; i < n; i++){
    let str = "";
    for(let j = 0; j <= i; j++){
        str += cnt++ + " ";
    }
    console.log(str);
}