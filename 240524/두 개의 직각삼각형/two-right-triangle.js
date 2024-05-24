const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    let result = "";

    for(let j = 0; j < n - i; j++){
        result += "*";
    }

    for(let j = 0; j < 2 * i; j++){
        result += " ";
    }

    for(let j = 0; j < n - i; j++){
        result += "*";
    }

    console.log(result);
}