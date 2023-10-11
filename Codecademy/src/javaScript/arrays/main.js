let newYearsResolutions = ['Keep a journal', 'Take a falconry class', 'Learn to juggle'];

let concepts = ['creating arrays', 'array structures', 'array manipulation'];

let newYearsResolutions = ['Keep a journal', 'Take a falconry class', 'Learn to juggle'];

const hello = 'Hello World';
console.log(hello[6]);
// Output: W

let seasons = ['Winter', 'Spring', 'Summer', 'Fall'];

seasons[3] = 'Autumn';
console.log(seasons);
//Output: ['Winter', 'Spring', 'Summer', 'Autumn']

const newYearsResolutions = ['Keep a journal', 'Take a falconry class'];

console.log(newYearsResolutions.length);
// Output: 2

const itemTracker = ['item 0', 'item 1', 'item 2'];

itemTracker.push('item 3', 'item 4');

console.log(itemTracker);
// Output: ['item 0', 'item 1', 'item 2', 'item 3', 'item 4'];


const newItemTracker = ['item 0', 'item 1', 'item 2'];

const removed = newItemTracker.pop();

console.log(newItemTracker);
// Output: [ 'item 0', 'item 1' ]
console.log(removed);
// Output: item 2


const flowers = ['peony', 'daffodil', 'marigold'];

function addFlower(arr) {
    arr.push('lily');
}

addFlower(flowers);

console.log(flowers); // Output: ['peony', 'daffodil', 'marigold', 'lily']

const nestedArr = [[1], [2, 3]];

const nestedArr = [[1], [2, 3]];

console.log(nestedArr[1]); // Output: [2, 3]

const nestedArr = [[1], [2, 3]];

console.log(nestedArr[1]); // Output: [2, 3]
console.log(nestedArr[1][0]); // Output: 2