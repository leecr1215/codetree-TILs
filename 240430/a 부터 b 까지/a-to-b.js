const fs = require('fs');

const [a, b] = fs.readFileSync(0).toString().split(" ").map(Number);

let i = a;

while(i <= b){
    process.stdout.write(i + " ");

    if(i % 2 != 0){
        i *= 2;
    }else{
        i += 3;
    }
}