const fs = require('fs');

let [a, b] = fs.readFileSync(0).toString().split(' ').map(Number);

while(a <= b){
    if(a % 2 == 0){
        process.stdout.write(a + ' ');
    }
    a++;
}