const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    for(let j = 0; j <= i; j++){
        process.stdout.write("*");
    }
    console.log("\n");
}

for(let i = 0; i < n - 1; i++){
    for(let j = 0; j < n - i -1; j++){
        process.stdout.write("*");
    }
    console.log("\n");
}