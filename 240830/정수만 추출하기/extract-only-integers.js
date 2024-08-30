function isInteger(num){
    return num % 1 === 0 ? true : false;
}

const fs = require('fs');
const [str1, str2] = fs.readFileSync(0).toString().trim().split(' ');

let result1 = '';
let result2 = '';

let idx = 0;
while(true){
    if(isInteger(str1[idx])){
        result1+= str1[idx];
    }else{
        break;
    }
    idx++;
}

idx = 0;
while(true){
    if(isInteger(str2[idx])){
        result2+= str2[idx];
    }else{
        break;
    }
    idx++;
}

console.log(Number(result1) + Number(result2));