const fs = require('fs');
const [start, end] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

const getDivisorCnt = (num) =>{
    let cnt = 0;
    for(let i = 1; i <= parseInt(Math.sqrt(num)); i++){
        if(num % i == 0) cnt++;
    }

    cnt = cnt * 2;

    // 중복 제거
    if(Math.sqrt(num) === parseInt(Math.sqrt(num))) cnt-=1;

    return cnt;
}

let cnt = 0;
for(let i = start; i <= end; i++){
    if(getDivisorCnt(i) === 3) cnt++;
}

console.log(cnt);