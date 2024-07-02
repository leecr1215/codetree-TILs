const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    for(let j = 0; j < n; j++){
        if(i > j || i == 0 || j == n - 1) {
            process.stdout.write("* ");
        }
        else {
            process.stdout.write("  ");
        }
    }
    console.log();
}