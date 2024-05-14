const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

for(let i = 0; i < input.length; i++){
    const [x, y, word] = input[i].split(' ');

    console.log(Number(x) * Number(y));

    if(word === 'C') break;
}