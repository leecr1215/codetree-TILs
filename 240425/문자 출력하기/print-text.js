const fs = require('fs');
const word = fs.readFileSync(0).toString().trim();

for(let i = 0; i < 8; i++){
    process.stdout.write(word);
}