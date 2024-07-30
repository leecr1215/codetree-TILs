const fs = require('fs');
const numbers = fs.readFileSync(0).toString().trim().split('\n')[1].split(' ').map(Number);

numbers.forEach(num => !(num % 2) && process.stdout.write(num + " "));