const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

const MAX_ALPHA = 'Z'.charCodeAt();

let cnt = 'A'.charCodeAt();


for(let i = 0; i < n; i++){
    let str = "";
    for(let j = 0; j <= i; j++){
        str += String.fromCharCode(cnt);
        if(MAX_ALPHA == cnt) cnt -= 25;
        else cnt++;
    }
    console.log(str);
}