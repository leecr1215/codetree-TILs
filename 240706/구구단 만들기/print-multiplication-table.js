const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().trim().split(' ').map(Number);

for(let i = 1; i <= 9; i++){
    let str = "";
    for(let j = b; j >= a; j-=2){
        str += j + " * " + i + " = " + i * j;
        if(j != a) str += " / ";
    }
    console.log(str);
}