const fs = require('fs');
const n = Number(fs.readFileSync(0).toString());

if(n < 1000){
    console.log('no');
}else if(n < 3000){
    console.log('mask');
}else{
    console.log('book');
}