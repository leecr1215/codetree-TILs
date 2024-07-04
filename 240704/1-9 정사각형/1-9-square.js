const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let cnt = 1;
for(let i = 0; i < n; i++){
    let str = "";
    for(let j = 0; j < n; j++){
        if(cnt > 9) cnt = cnt % 10 + 1;
        str += cnt++;           
    }
    console.log(str);
}