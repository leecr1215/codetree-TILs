const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

const nums = new Array(n).fill().map((_,i) => i+1);

for(let i = 0; i < n; i++){
    let str = "";
    for(let j = 0; j < n; j++){
        if(j % 2 == 0){
            str += nums[i]
        }else{
            str += nums[n-i-1];
        }
    }
    console.log(str);
}