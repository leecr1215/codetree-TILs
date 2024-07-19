const fs = require('fs');
const scores = fs.readFileSync(0).toString().trim().split(' ').map(Number);

const STUDENT_CNT = 8;

const sum = scores.reduce((acc, cur)=>acc+cur, 0);

console.log(Math.round(sum / STUDENT_CNT * 10) / 10);