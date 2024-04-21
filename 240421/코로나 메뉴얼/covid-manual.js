class Patient {
    #hasSymptom;
    #temperature;

    constructor(hasSymptom, temperature){
        this.#hasSymptom = hasSymptom;
        this.#temperature = temperature;
    }

    goAClinic(){
        return this.#hasSymptom && this.#temperature >= 37;
    }

}

function emergencyJudgment() {
    const fs = require('fs');

    const arr = fs.readFileSync(0).toString().trim().split(/\s+/);
    
    const p1 = new Patient(hasSymptom(arr[0]), arr[1]);
    const p2 = new Patient(hasSymptom(arr[2]), arr[3]);
    const p3 = new Patient(hasSymptom(arr[4]), arr[5]);
    
    let cnt = 0;

    if(p1.goAClinic()){
        cnt++;
    }

    if(p2.goAClinic()){
        cnt++;
    }

    if(p3.goAClinic()){
        cnt++;
    }

    if(cnt >= 2){
        console.log('E');
    }else{
        console.log('N');
    }

}

function hasSymptom(value){
    return value==='Y' ? true : false;
}

emergencyJudgment();