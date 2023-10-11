const logSkyColor = () => {
    let color = 'blue';
    console.log(color); // blue
}

if (dusk) {
    let color = 'pink';
    console.log(color); // pink
}


const color = 'blue';

const returnSkyColor = () => {
    return color; // blue
};

console.log(returnSkyColor()); // blue


const logSkyColor = () => {
    let color = 'blue';
    console.log(color); // Prints "blue"
};

logSkyColor(); // Prints "blue"
console.log(color); // throws a ReferenceError


let num = 50;

const logNum = () => {
    num = 100; // Take note of this line of code
    console.log(num);
};

logNum(); // Prints 100
console.log(num); // Prints 100


const logSkyColor = () => {
    const dusk = true;
    let color = 'blue';
    if (dusk) {
        let color = 'pink';
        console.log(color); // Prints "pink"
    }
    console.log(color); // Prints "blue"
};

console.log(color); // throws a ReferenceError
