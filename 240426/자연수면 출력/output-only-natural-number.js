const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

if(a > 0){
    process.stdout.write(String(a).repeat(b));
}