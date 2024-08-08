const fs = require('fs');
const [n, m] = fs.readFileSync(0).toString().trim().split(' ').map(Number);
const arr = Array(n).fill(0).map(() => Array(m).fill(0));

let cnt = 1;
let str = "";

for(let i = 0; i < n; i++){
    for(let j = 0; j < m; j++){
        arr[i][j] = cnt++;
        str += arr[i][j] + " ";
    }
    str += "\n";
}

console.log(str);