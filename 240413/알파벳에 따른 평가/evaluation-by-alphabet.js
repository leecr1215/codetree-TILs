const fs = require('fs');
const alpha = fs.readFileSync(0).toString();

let result;

if(alpha === 'S'){
    result = 'Superior';
}else if(alpha === 'A'){
    result = 'Excellent';
}else if(alpha === 'B'){
    result = 'Good';
}else if(alpha === 'C'){
    result = 'Usually';
}else if(alpha === 'D'){
    result = 'Effort';
}else{
    result = 'Failure';
}

console.log(result);