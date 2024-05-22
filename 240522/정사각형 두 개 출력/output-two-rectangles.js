const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < 2; i++){
    for(let j = 0; j < n; j++){
        for(let k = 0; k < n; k++){
            process.stdout.write('*');
        }
        console.log();
    }
    console.log();
}