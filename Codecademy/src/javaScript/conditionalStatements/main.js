let groceryItem = 'papaya';

if (groceryItem === 'tomato') {
    console.log('Tomatoes are $0.49');
} else if (groceryItem === 'papaya'){
    console.log('Papayas are $1.29');
} else {
    console.log('Invalid item');
}

let groceryItem = 'papaya';

switch (groceryItem) {
    case 'tomato':
        console.log('Tomatoes are $0.49');
        break;
    case 'lime':
        console.log('Limes are $1.49');
        break;
    case 'papaya':
        console.log('Papayas are $1.29');
        break;
    default:
        console.log('Invalid item');
        break;
}

// Prints 'Papayas are $1.29'


let stopLight = 'yellow';

if (stopLight === 'red') {
    console.log('Stop!');
} else if (stopLight === 'yellow') {
    console.log('Slow down.');
} else if (stopLight === 'green') {
    console.log('Go!');
} else {
    console.log('Caution, unknown!');
}


let isNightTime = true;

if (isNightTime) {
    console.log('Turn on the lights!');
} else {
    console.log('Turn off the lights!');
}


isNightTime ? console.log('Turn on the lights!') : console.log('Turn off the lights!');


let username = '';
let defaultName;

if (username) {
    defaultName = username;
} else {
    defaultName = 'Stranger';
}

console.log(defaultName); // Prints: Stranger


let username = '';
let defaultName = username || 'Stranger';

console.log(defaultName); // Prints: Stranger


let myVariable = 'I Exist!';

if (myVariable) {
    console.log(myVariable)
} else {
    console.log('The variable does not exist.')
}


let numberOfApples = 0;

if (numberOfApples){
    console.log('Let us eat apples!');
} else {
    console.log('No apples left!');
}

// Prints 'No apples left!'


if (stopLight === 'green' && pedestrians === 0) {
    console.log('Go!');
} else {
    console.log('Stop');
}


if (day === 'Saturday' || day === 'Sunday') {
    console.log('Enjoy the weekend!');
} else {
    console.log('Do some work.');
}


let excited = true;
console.log(!excited); // Prints false

let sleepy = false;
console.log(!sleepy); // Prints true

10 < 12 // Evaluates to true
'apples' === 'oranges' // false

if (false) {
    console.log('The code in this block will not run.');
} else {
    console.log('But the code in this block will!');
}

// Prints: But the code in this block will!


if (true) {
    console.log('This message will print!');
}
// Prints: This message will print!
