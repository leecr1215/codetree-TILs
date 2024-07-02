const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    
    for(let j = 0; j < n; j++){
        if(j % 2 === 0 && j >= i){
            process.stdout.write("* ");
        }else if(i === 1){
            process.stdout.write("* ");
        }else{
            process.stdout.write("  ");
        }
    }
    console.log();
}