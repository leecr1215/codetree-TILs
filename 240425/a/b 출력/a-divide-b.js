const fs = require('fs');
let [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

// 정수
process.stdout.write(parseInt(a/b) + '.');

a %= b;

for(let i = 0; i < 20; i++){
    process.stdout.write(parseInt(a * 10 / b).toString());
    a = (a * 10) % b;
}