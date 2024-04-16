const fs = require('fs');
const a = Number(fs.readFileSync(0).toString());

const YES = 'YES';
const NO = 'NO';

if(a % 3 == 0){
    console.log(YES);
}else{
    console.log(NO);
}

if(a % 5 == 0){
    console.log(YES);
}else{
    console.log(NO);
}