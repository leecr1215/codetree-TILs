const fs = require('fs');
const words = fs.readFileSync(0).toString().trim().split('\n');

words.reverse().forEach((word)=>{
    console.log(word);
});