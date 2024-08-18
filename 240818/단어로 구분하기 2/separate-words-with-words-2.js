const fs = require('fs');
const strs = fs.readFileSync(0).toString().trim().split(" ");

strs.forEach((str, idx)=>{
    if(idx % 2 == 0) console.log(str);
})