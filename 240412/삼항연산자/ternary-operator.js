const fs = require('fs');
const score = Number(fs.readFileSync(0).toString());

const result = score === 100 ? "pass" : "failure";

console.log(result);