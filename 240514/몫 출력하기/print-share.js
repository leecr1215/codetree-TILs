const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n').map(Number);

let cnt = 0;
let idx = 0;

while(cnt < 3){
    if(input[idx] % 2 == 0){
        cnt++;
        console.log(parseInt(input[idx] / 2));
    }

    idx++;
}