const fs = require('fs');
const input = fs.readFileSync(0).toString().trim().split('\n');

const n = Number(input[0]);
const scores = input[1].split(' ').map(Number);

const sum = scores.reduce((acc, cur) => acc + cur, 0);

console.log((sum / n).toFixed(1));

const calculateScore = (score) => {
    if(score >= 4.0){
        return 'Perfect';
    }else if(score >= 3.0){
        return 'Good';
    }else{
        return 'Poor';
    }
}

console.log(calculateScore(sum / n));