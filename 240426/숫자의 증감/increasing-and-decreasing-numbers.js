const fs = require('fs');

let [c, n] = fs.readFileSync(0).toString().split(' ');

n = Number(n);

if(c === 'A'){
    for(let i = 1; i <= n; i++){
        process.stdout.write(i + ' ');
    }
}else{
    for(let i = n; i > 0; i--){
        process.stdout.write(i + ' ');
    }
}