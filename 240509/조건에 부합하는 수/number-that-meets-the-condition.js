const fs = require('fs');

const a = Number(fs.readFileSync(0).toString().trim());

const result = [];

for(let i = 1; i <= a; i++){
    if(i % 2 === 0 && i % 4 !== 0) continue;
    if(parseInt(i / 8) % 2 === 0) continue;
    if((i % 7) < 4) continue;

    result.push(i);
}

result.sort((a, b) => a - b);

console.log(result.join(' '));