const fs = require('fs');
let input = fs.readFileSync(0).toString().trim().split(' ').map(Number);

let [n, m] = input;
let cnt = 1;

let arr2d = Array(n)
	.fill(0)
	.map(() => Array(m).fill(0));

let ijSum = 0;

while (ijSum <= n*m) {
    for (let i = 0; i < n; i += 1) {
        for (let j = 0; j < m; j += 1) {
            if (i + j === ijSum) {
                arr2d[i][j] = cnt++;
            } else {
                continue;
            }
        }
    }
    ijSum += 1;
}

for (let i = 0; i < n; i += 1) {
    let result = '';
    for (let j = 0; j < m; j += 1) {
        result += arr2d[i][j] + ' ';
    }
    console.log(result);
}