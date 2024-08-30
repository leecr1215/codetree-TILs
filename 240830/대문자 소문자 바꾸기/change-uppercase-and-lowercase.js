const fs = require('fs');
let str = fs.readFileSync(0).toString().trim();

str = str.split('').map((c) => {
    if(c >= 'a' && c <= 'z'){
        // 소문자
        return c.toUpperCase();
    }
    else{
        return c.toLowerCase();
    }
})

console.log(str.join(''));