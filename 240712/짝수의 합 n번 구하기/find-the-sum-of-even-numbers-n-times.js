const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(arr[0]);

const getEvensSum = (a, b) => {
    let sum = 0;
    
    for(let i = a; i <= b; i++){
        if(i % 2 == 0) sum += i;
    }

    return sum;
}

for(let i = 1; i <= n; i++){
    const [a, b] = arr[i].split(' ').map(Number);

    console.log(getEvensSum(a, b));
}