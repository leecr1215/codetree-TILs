const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    for(let j = 1; j <= n; j++){
        process.stdout.write(j+'');
    }
    console.log();
}