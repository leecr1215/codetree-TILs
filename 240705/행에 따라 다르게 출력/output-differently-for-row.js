const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let cnt = 0;
for(let i = 0; i < n; i++) {
    let str = "";
    for(let j = 0; j < n; j++) {
        if(i % 2 == 0)
            cnt++;
        else
            cnt += 2;
        
        str += cnt + " ";
    }
    console.log(str);
}