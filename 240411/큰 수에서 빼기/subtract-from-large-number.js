const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

if(a < b){
    console.log(b - a);
}else{
    console.log(a - b);
}