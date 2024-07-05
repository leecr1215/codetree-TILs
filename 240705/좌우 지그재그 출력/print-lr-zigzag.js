const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for (let i = 0; i < n; i++) {
    str = "";
    for (let j = 0; j < n; j++) {
        if (i % 2 === 0) str += (i * n) + j + 1 + " ";
        else str += (i * n) + n - j + " ";
    }
    console.log(str);
}