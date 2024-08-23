const fs = require('fs');
const arr = fs.readFileSync(0).toString().trim().split("");

const first = arr[0];
const second = arr[1];

arr.forEach((word, idx)=>{
    if(word === first){
        arr[idx] = second;
    }else if(word === second){
        arr[idx] = first;
    }
})

console.log(arr.join(''));