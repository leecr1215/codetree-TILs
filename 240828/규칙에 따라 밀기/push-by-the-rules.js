const fs = require('fs');
let [str, commands] = fs.readFileSync(0).toString().trim().split('\n');

const rightShift = (str) => {
    return str.slice(-1) + str.slice(0, -1);
}

const leftShift = (str) => {
    return str.slice(1) + str[0];
}

commands.split('').forEach((command) => {
    if(command === 'L'){
        str = leftShift(str);
    }else{
        str = rightShift(str);
    }
})

console.log(str);