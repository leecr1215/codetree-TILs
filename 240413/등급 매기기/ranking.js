const fs = require('fs');
const n = Number(fs.readFileSync(0).toString());

let result;

if(n >= 90){
    result = 'A';
}else if(n >= 80){
    result = 'B';
}else if(n >= 70){
    result = 'C';
}else if(n >= 60){
    result = 'D';
}else{
    result = 'F';
}

console.log(result);