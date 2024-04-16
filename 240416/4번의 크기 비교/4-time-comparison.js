const fs = require('fs');
const [a, b, c, d, e] = fs.readFileSync(0).toString().split(/\s/).map(Number);

if(a > b){
    console.log(1);
}else{
    console.log(0);
}

if(a > c){
    console.log(1);
}else{
    console.log(0);
}

if(a > d){
    console.log(1);
}else{
    console.log(0);
}

if(a > e){
    console.log(1);
}else{
    console.log(0);
}