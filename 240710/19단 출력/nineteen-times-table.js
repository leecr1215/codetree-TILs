for(let i = 1; i <= 19; i++){
    let str = "";
    for(let j = 1; j <= 19; j++){
        if(j % 2 == 0) str += ` / ${i} * ${j} = ${i*j}\n`;
        else str += `${i} * ${j} = ${i*j}`;
    }
   console.log(str);
}