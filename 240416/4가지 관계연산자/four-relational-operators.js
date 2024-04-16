const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);


if(a >= b){
    console.log(1);
}else{           
    console.log(0);
}

if(a > b){
    console.log(1);
}else{
    console.log(0);
}

if(b >= a){
    console.log(1);
}else{
    console.log(0);
}

if(b > a){
    console.log(1);
}else{
    console.log(0);
}