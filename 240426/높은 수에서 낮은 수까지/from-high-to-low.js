const fs = require('fs');
const [a, b] = fs.readFileSync(0).toString().split(" ").map(Number);

const max = Math.max(a, b);
const min = Math.min(a, b);

for(let i = max; i >= min; i--){
    process.stdout.write(i + " ");
}