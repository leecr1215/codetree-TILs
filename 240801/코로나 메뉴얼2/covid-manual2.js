const fs = require('fs');
const people = fs.readFileSync(0).toString().trim().split('\n');

const clinic = Array(4).fill(0);

for(let i = 0; i < 3; i++){
    const [hasCold, temperature] = people[i].split(' ');

    if(hasCold === 'Y'){
        if(temperature >= 37){
            clinic[0]++;
        }else{
            clinic[2]++;
        }
    }else{
        if(temperature >= 37){
            clinic[1]++;
        }else{
            clinic[3]++;
        }
    }
}


clinic.forEach((count)=>process.stdout.write(count + ' '));

if(clinic[0] >= 2) process.stdout.write('E' +'');