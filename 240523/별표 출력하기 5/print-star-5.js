const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    for(let j = 0; j < n-i; j++){
        for(let k = 0; k < n-i; k++){
            process.stdout.write("*");
        }
        process.stdout.write(" ");
    }
    console.log();
}