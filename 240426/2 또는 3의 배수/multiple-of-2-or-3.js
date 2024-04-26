const fs = require('fs');
const n = Number(fs.readFileSync(0).toString());

for(let i = 1; i <= n; i++){
    if(i % 2 == 0 || i % 3 == 0){
        process.stdout.write(1 + " ");
    }else{
        process.stdout.write(0 + " ");
    }
}