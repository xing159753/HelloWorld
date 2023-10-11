for (let counter = 0; counter < 4; counter++) {
    console.log(counter);
}

const animals = ['Grizzly Bear', 'Sloth', 'Sea Lion'];
for (let i = 0; i < animals.length; i++){
    console.log(animals[i]);
}

const myArray = [6, 19, 20];
const yourArray = [19, 81, 2];
for (let i = 0; i < myArray.length; i++) {
    for (let j = 0; j < yourArray.length; j++) {
        if (myArray[i] === yourArray[j]) {
            console.log('Both arrays have the number: ' + yourArray[j]);
        }
    }
}


const myArray = [6, 19, 20];
const yourArray = [19, 81, 2];
for (let i = 0; i < myArray.length; i++) {
    for (let j = 0; j < yourArray.length; j++) {
        if (myArray[i] === yourArray[j]) {
            console.log('Both arrays have the number: ' + yourArray[j]);
        }
    }
}

let countString = '';
let i = 0;

do {
    countString = countString + i;
    i++;
} while (i < 5);

console.log(countString);

for (let i = 0; i < 99; i++) {
    if (i > 2 ) {
        break;
    }
    console.log('Banana.');
}

console.log('Orange you glad I broke out the loop!');
