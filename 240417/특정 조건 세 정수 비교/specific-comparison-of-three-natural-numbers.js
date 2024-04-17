const fs = require('fs');

const [a, b, c] = fs.readFileSync(0).toString().split(' ').map(Number);

let min = Math.min(a, b);
min = Math.min(min, c);

if(min == a){
    process.stdout.write(1 + " ");
}else{
    process.stdout.write(0 + " ");
}

if(a === b && b === c){
    process.stdout.write('1');
}else{
    process.stdout.write('0');
}