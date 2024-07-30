const fs = require('fs');
let n = Number(fs.readFileSync(0).toString().trim());

let cnt = 0;

let num = n;

while(cnt != 2){
    
    if(num % 5 === 0){
        cnt++;
    }

    process.stdout.write(num + ' ');

    num += n;
}