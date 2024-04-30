const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 1; i <= n; i++){
    if(i % 3 == 0 || String(i).includes('3') || String(i).includes('6') || String(i).includes('9')){
        process.stdout.write('0 ');
    }else{
        process.stdout.write(i + ' ');
    }
}