const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

let cnt = 1;
for(let i = n; i > 0; i--){
    let str = "";
    for(let j = n; j > 0; j--){
        if(i < j){
            str += "  ";
        }
        else{
            str += cnt++ + " ";
            if(cnt > 9) cnt = 1;
        }
        
    }
    console.log(str);
}