const fs = require('fs');
const[a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

for(let i = b; i >= a; i--){
    process.stdout.write(i + ' ');
}