const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

const fibo = [];
fibo.push(1);
fibo.push(n);

let idx = 2;

while(true){
    const sum = fibo[idx-1] + fibo[idx-2];
    fibo.push(sum);
    if(sum > 100) break;
    idx++;
}

for(num of fibo){
    process.stdout.write(num + ' ');
}