function ftToCm(value){
    return value * 30.48;
}

function miToCm(value){
    return value * 160934;
}

let ft = 9.2;
let mi = 1.3;

console.log(`${ft}ft = ${ftToCm(ft).toFixed(1)}cm`);
console.log(`${mi}mi = ${miToCm(mi).toFixed(1)}cm`);