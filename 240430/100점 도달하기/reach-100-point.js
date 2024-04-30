const fs = require('fs');
const n = Number(fs.readFileSync(0).toString().trim());

for(let i = n; i <= 100; i++){
    const grade = getGrade(i);

    process.stdout.write(grade + " ");
}


/**
 * @{score} : Number
 */
function getGrade(score){
    if(score >= 90){
        return 'A';
    }else if(score >= 80){
        return 'B';
    }else if(score >= 70){
        return 'C';
    }else if(score >= 60){
        return 'D';
    }else{
        return 'F';
    }
}