const fs = require('fs');

const [gender, age] = fs.readFileSync(0).toString().split("\n").map(Number);

if(gender == 0){ // 남자
    if(age >= 19){
        console.log('MAN');
    }else{
        console.log('BOY');
    }
}else{ // 여자
    if(age >= 19){
        console.log('WOMAN');
    }else{
        console.log('GIRL');
    }
}