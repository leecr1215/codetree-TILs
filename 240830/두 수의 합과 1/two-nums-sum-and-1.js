const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().trim().split(' ').map(Number);
const sum = a+b+'';

let cnt = 0;
sum.split('').forEach((num)=>{
    if(num==='1'){
        cnt++;
    }
})

console.log(cnt);