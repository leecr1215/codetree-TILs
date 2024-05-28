const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = n; i > 0; i--){
    for(let j = 0; j < n - i; j++){
        process.stdout.write('  ');
    }
    for(let j = 0; j < 2 * i - 1; j++){
        process.stdout.write('* ');
    }
    console.log();
}

for(let i = 1; i <= n - 1; i++){
    for(let j = 0; j < n - i - 1; j++){
        process.stdout.write('  ');
    }
    for(let j = 0; j < 2 * i + 1; j++){
        process.stdout.write('* ');
    }
    console.log();
}