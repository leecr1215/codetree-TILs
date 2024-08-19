const fs = require('fs');
const strs = fs.readFileSync(0).toString().trim();

let result = '';

let targetAlpha = strs[0];
let cnt = 0;

for(let i = 0; i < strs.length; i++){
    if(targetAlpha === strs[i]){
        cnt++;
    }else{
        result += targetAlpha + cnt;
        targetAlpha = strs[i];
        cnt = 1;
    }
}

result += targetAlpha + cnt;


console.log(result.length);
console.log(result);