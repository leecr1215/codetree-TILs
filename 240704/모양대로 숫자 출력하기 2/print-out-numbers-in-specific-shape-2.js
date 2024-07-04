const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

// 10 미만의 짝수를 저장하는 배열
const evens = [2,4,6,8];

let cnt = 0;

for(let i = 0; i < n; i++){
    for(let j = 0; j < n; j++){
        process.stdout.write(evens[cnt % 4]+" ");
        cnt++;
    }

    console.log();
}