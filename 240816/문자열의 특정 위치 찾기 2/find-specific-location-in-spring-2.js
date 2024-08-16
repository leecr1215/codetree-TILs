const fs = require('fs');
const alpha = fs.readFileSync(0).toString().trim();

const fruits = ['apple', 'banana', 'grape', 'blueberry', 'orange'];

let cnt = 0;
fruits.forEach((fruit) => {
    if(fruit[2] === alpha || fruit[3] === alpha){
        console.log(fruit);
        cnt++;
    }
})

console.log(cnt);