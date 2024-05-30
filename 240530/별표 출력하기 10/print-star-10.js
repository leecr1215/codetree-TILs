const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n*2; i++){
    if(i % 2 != 0){ // 홀수
        for(let j = 0; j <= (n * 2 - i) / 2; j++){
            process.stdout.write("* ");
        }
    }else{ // 짝수
        for(let j = 0; j < 1 + (i / 2); j++){
            process.stdout.write("* ");
        }
    }
    console.log();
}