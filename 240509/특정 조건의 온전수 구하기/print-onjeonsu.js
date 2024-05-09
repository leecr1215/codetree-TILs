const fs = require('fs');

const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 1; i <= n; i++){
    if(i % 2 === 0) continue;
    if(i % 10 === 5) continue;
    if(i % 3 === 0 && i % 9 !== 0) continue;

    process.stdout.write(i + ' ');
}