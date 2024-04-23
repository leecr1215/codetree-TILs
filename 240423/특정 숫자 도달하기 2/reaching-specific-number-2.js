const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = n; i > 0; i--){
    process.stdout.write(i + ' ');
}