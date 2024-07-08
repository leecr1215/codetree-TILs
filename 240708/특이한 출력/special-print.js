const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for (let i = 1; i <= n; i++) {
    for (let j = 1; j <= n; j++) {
        if ((i+j) % 4 == 0) {
            console.log("(" + i + ", " + j + ")");
        }
        else {
            process.stdout.write("(" + i + ", " + j + ") ");
        }
    }
}