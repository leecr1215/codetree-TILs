const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

let [str, n] = input[0].split(' ');

str = str.split('');

input.splice(1).forEach((value)=>{
    const [type, a, b] = value.split(' ');


    if(Number(type) === 1){

        const temp = str[Number(a)-1]; // a 
        str[Number(a)-1] = str[Number(b)-1]; 
        str[Number(b)-1] = temp;
        
        
    }else{
        str = str.map((alpha)=>alpha === a ? b : alpha);
    }

    console.log(str.join(''));
})