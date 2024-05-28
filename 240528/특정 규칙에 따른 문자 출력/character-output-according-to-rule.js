const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    for(let j = 0; j < n - i - 1; j++){
        process.stdout.wrtie("  ");
    }
    for(let j = 0; j <= i; j++){
        process.stdout.wrtie("@ ");
    }
    console.log();
}

for(let i = n - 1; i > 0; i--){
    for(let j = 0; j < i; j++){
        process.stdout.wrtie("@ ");
    }
    console.log();
}