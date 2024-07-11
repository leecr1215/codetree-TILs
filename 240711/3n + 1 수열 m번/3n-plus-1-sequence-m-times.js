const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(arr[0]);

for(let i = 1; i <= n; i++){
    console.log(getResult(Number(arr[i])));
}

function getResult(num){
    let cnt = 0;

    while(num !== 1){
        if(num % 2 === 0) num /= 2;
        else num = num * 3 + 1;
        cnt++;
    }

    return cnt;
}