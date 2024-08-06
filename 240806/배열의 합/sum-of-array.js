const fs = require('fs');
const rows = fs.readFileSync(0).toString().trim().split('\n');

rows.forEach((row) => {
    const sum = row.split(' ').reduce((acc, cur) => Number(acc) + Number(cur), 0);
    console.log(sum);
})