const fs = require('fs');
const alpha = fs.readFileSync(0).toString().trim();

if(alpha === 'z'){
    console.log('a');
}else{
    console.log(String.fromCharCode(alpha.charCodeAt() + 1));
}