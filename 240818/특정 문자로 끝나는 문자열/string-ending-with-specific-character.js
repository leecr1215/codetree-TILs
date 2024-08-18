const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split("\n");

const target = input[input.length-1];
const strs = input.slice(0, -1).filter((str)=>str[str.length-1] === target);

if(strs.length===0){
    console.log('None');
}
else{
    strs.forEach((str)=>{
        console.log(str);
    })
}