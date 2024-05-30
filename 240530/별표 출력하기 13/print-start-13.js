const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n * 2; i++){
    // 짝수
    if(i % 2 == 0){
        for(let j = 0; j < (n * 2 - i) / 2; j++){
            process.stdout.write("* ");
        }
    }
    // 홀수
    else{
        for(let j = 0; j < (i + 1) / 2; j++){
            process.stdout.write("* ");
        }
    }

    console.log();
}