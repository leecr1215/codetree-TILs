const fs = require('fs');
const nums = fs.readFileSync(0).toString().trim().split(' ').map(Number);

nums.forEach((num)=>{
    process.stdout.write(String.fromCharCode(num) + " ");
})