const fs = require('fs');
const [b, a] = fs.readFileSync(0).toString().split(' ').map(Number);

for(let i = b; i >= a; i--){
    if(i % 2 !== 0){
        process.stdout.write(i + ' ');
    }
}