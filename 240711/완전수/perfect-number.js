const fs = require('fs');
const [start, end] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

const getDivisorSum  = (num) => {
    let sum = 0;

    for(let i = 2; i <= parseInt(Math.sqrt(num)); i++){
        if(num % i == 0){
            // 약수임
            sum += i;
            sum += num / i;
        }
    }
    // 1도 포함해야함
    sum += 1;

    return sum;
}

let cnt = 0;
for(let i = start; i <= end; i++){
    if(getDivisorSum(i) == i) cnt++;
}

console.log(cnt);