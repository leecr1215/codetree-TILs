const fs = require('fs');
const n = Number(fs.readFileSync(0).toString());

let classCnt = 0;
let passageCnt = 0;
let restRoomCnt = 0;

for(let i = 1; i <= n; i++){
    if(i % 12 === 0){
        restRoomCnt++;
    }else if(i % 3 === 0){
        passageCnt++;
    }else if(i % 2 === 0){
        classCnt++;
    }
}

console.log(classCnt + ' ' + passageCnt + ' ' + restRoomCnt);