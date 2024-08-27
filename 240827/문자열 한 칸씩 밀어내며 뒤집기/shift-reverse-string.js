const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');
let [str, q] = input[0].split(' ');

const shiftLeft = (str) => {
    return str.slice(1) + str[0];
}

const shiftRight = (str) => {
    return str.slice(-1) + str.slice(0, -1);
}

const inversion = (str) => {
    const temp = str;
    return str.split('').map((_, idx) => temp[temp.length - idx - 1]).join('');
}

for(let i = 1; i <= Number(q); i++){
    if(input[i] === '1'){
        str = shiftLeft(str);
    }else if(input[i] === '2'){
        str = shiftRight(str);
    }else{
        str = inversion(str);
    }
    console.log(str);
}