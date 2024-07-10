const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let cnt = 'A'.charCodeAt();

for(let i = 0; i < n; i++){
    let str = "";
    for(let j = 0; j < n; j++){
        str += String.fromCharCode(cnt);
        cnt++;
    }

    console.log(str);
}