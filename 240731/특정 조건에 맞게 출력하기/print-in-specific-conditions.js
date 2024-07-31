const fs = require('fs');
 const arr = fs.readFileSync(0).toString().trim().split(' ').map(Number);

 for(let i = 0; i < arr.length; i++){
    if(arr[i] === 0) break;

    if(arr[i] % 2 === 0){
        process.stdout.write(arr[i] / 2 + " ");
    }else{
        process.stdout.write(arr[i] + 3 + " ");
    }
 }