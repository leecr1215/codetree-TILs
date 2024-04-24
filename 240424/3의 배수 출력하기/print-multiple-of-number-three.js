const fs = require('fs');

const n = Number(fs.readFileSync(0).toString().trim());

let i = 3;
while(i <= n){
    process.stdout.write(i + " ");
    i += 3;
}