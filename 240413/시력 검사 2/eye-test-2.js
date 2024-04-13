const fs = require('fs');
const a = Number(fs.readFileSync(0).toString())

let result;

if(a >= 1.0){
    result = "High";
}else if(a >= 0.5){
    result = "Middle";
}else{
    result = "Low";
}

console.log(result);