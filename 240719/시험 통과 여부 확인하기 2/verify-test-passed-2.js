const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);
let cnt = 0;

for(let i = 1; i <= n; i++){
    const sum = input[i].split(' ').map(Number).reduce((acc, cur)=>acc+cur, 0);

    if(sum / 4 >= 60){
        console.log('pass');
        cnt++;
    }else{
        console.log('fail');
    }

}

console.log(cnt);