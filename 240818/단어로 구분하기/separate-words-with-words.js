const fs = require('fs');
const strs = fs.readFileSync(0).toString().trim().split(" ");

strs.forEach((str)=>{
    console.log(str);
})