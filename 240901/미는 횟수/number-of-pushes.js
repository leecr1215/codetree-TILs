const fs = require('fs');
let [A, B] = fs.readFileSync(0).toString().trim().split('\n');

const rightShift = (str) => {
    return str.slice(-1) + str.slice(0, -1);
}

let cnt = 0;

while(cnt < A.length){
    if(A === B){
        break;
    }else{
        cnt++;
        A = rightShift(A);
    }

}

if(cnt == A.length){
    console.log(-1);
}else{
    console.log(cnt);
}