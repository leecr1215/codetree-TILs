const fs = require('fs');
const [mathA, englishA, mathB, englishB] = fs.readFileSync(0).toString().split(/\s+/).map(Number);

if(mathA === mathB){
    if(englishA > englishB){
        console.log('A');
    }else{
        console.log('B');
    }
}else{
    if(mathA > mathB){
        console.log('A');
    }else{
        console.log('B');
    }
}