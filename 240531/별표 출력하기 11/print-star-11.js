const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < 2 * n + 1; i++){
    for(let j = 0; j < 2 * n + 1; j++){
        if(i % 2 === 0 || j % 2 === 0){
            process.stdout.write("* ");
        }else{
            process.stdout.write("  ");
        }
    }
    console.log();
}