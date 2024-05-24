const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = 0; i < n; i++){
    let temp = "";

    for(let j = 0; j < n - i - 1; j++){
        temp += "  "; 
    }

    for(let j = 0; j < 2 * i + 1; j++){
        temp += "* ";
    }

    console.log(temp);
}