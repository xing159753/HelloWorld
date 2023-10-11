const goat = {
    dietType: 'herbivore',
    makeSound() {
        console.log('baaa');
    }
};

goat.makeSound(); // Prints baaa

const goat = {
    dietType: 'herbivore',
    makeSound() {
        console.log('baaa');
    },
    diet() {
        console.log(dietType);
    }
};
goat.diet();
// Output will be "ReferenceError: dietType is not defined"

const goat = {
    dietType: 'herbivore',
    makeSound() {
        console.log('baaa');
    },
    diet() {
        console.log(this.dietType);
    }
};

goat.diet();
// Output: herbivore

const goat = {
    dietType: 'herbivore',
    makeSound() {
        console.log('baaa');
    },
    diet: () => {
        console.log(this.dietType);
    }
};

goat.diet(); // Prints undefined

const bankAccount = {
    _amount: 1000
}

bankAccount._amount = 1000000;


const person = {
    _firstName: 'John',
    _lastName: 'Doe',
    get fullName() {
        if (this._firstName && this._lastName){
            return `${this._firstName} ${this._lastName}`;
        } else {
            return 'Missing a first name or a last name.';
        }
    }
}

// To call the getter method:
person.fullName; // 'John Doe'


const person = {
    _firstName: 'John',
    _lastName: 'Doe',
    get fullName() {
        if (this._firstName && this._lastName){
            return `${this._firstName} ${this._lastName}`;
        } else {
            return 'Missing a first name or a last name.';
        }
    }
}

// To call the getter method:
person.fullName; // 'John Doe'


person.age = 40;
console.log(person._age); // Logs: 40
person.age = '40'; // Logs: You must assign a number to age

person._age = 'forty-five'
console.log(person._age); // Prints forty-five

const monsterFactory = (name, age, energySource, catchPhrase) => {
    return {
        name: name,
        age: age,
        energySource: energySource,
        scare() {
            console.log(catchPhrase);
        }
    }
};

const ghost = monsterFactory('Ghouly', 251, 'ectoplasm', 'BOO!');
ghost.scare(); // 'BOO!'


const monsterFactory = (name, age) => {
    return {
        name: name,
        age: age
    }
};

const monsterFactory = (name, age) => {
    return {
        name,
        age
    }
};


const vampire = {
    name: 'Dracula',
    residence: 'Transylvania',
    preferences: {
        day: 'stay inside',
        night: 'satisfy appetite'
    }
};


const residence = vampire.residence;
console.log(residence); // Prints 'Transylvania'