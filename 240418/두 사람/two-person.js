const fs = require('fs');

class Person {
    #age;
    #gender;

    constructor(age, gender){
        this.#age = age;
        this.#gender = gender;
    }

    get age(){
        return this.#age;
    }

    get gender(){
        return this.#gender;
    }
}

const input = fs.readFileSync(0).toString().split("\n");

const person1 = new Person(...(input[0].split(" ")));
const person2 = new Person(...(input[1].split(" ")));

if((person1.age >= 19 && person1.gender === 'M') || (person2.age >= 19 && person2.gender === "M")){
    console.log(1);
}else{
    console.log(0);
}