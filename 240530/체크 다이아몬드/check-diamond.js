const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 1; i <= n; i++){
    for(let j = n; j > i; j--){
        process.stdout.write(" ");
    }

    for(let j = 0; j < i; j++){
        process.stdout.write("* ");
    }
    console.log();
}

for(let i = n; i > 1; i--){
    for(let j = i; j <= n; j++){
        process.stdout.write(" ");
    }

    for(let j = 1; j < i; j++){
        process.stdout.write("* ");
    }
    console.log();
}