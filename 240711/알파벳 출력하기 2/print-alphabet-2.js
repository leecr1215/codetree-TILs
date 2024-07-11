const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let cnt = 'A'.charCodeAt();

for(let i = 0; i < n; i++){
    let str = "";
    for(let j = 0; j < i; j++){
        str += "  ";
    }
    for(let j = i; j < n; j++){
        if(cnt > 90) cnt = 'A'.charCodeAt;
        str += String.fromCharCode(cnt) + " ";
        cnt++;
    }
    console.log(str);
}