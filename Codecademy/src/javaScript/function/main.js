const width = 10;
const height = 6;
const area =  width * height;
console.log(area); // Output: 60

function sayThanks(name) {
    console.log('Thank you for your purchase '+ name + '! We appreciate your business.');
};
sayThanks('Cole')

function sayThanks(name) {
    console.log('Thank you for your purchase '+ name + '! We appreciate your business.');
};
sayThanks('Cole')

function makeShoppingList(item1='milk', item2='bread', item3='eggs'){
    console.log(`Remember to buy ${item1}`);
    console.log(`Remember to buy ${item2}`);
    console.log(`Remember to buy ${item3}`);
}

function rectangleArea(width, height) {
    let area = width * height;
}
console.log(rectangleArea(5, 7)) // Prints undefined


function rectangleArea(width, height) {
    if (width < 0 || height < 0) {
        return 'You need positive integers to calculate area!';
    }
    return width * height;
}

function monitorCount(rows,columns) {
    return rows * columns;
};
const numOfMonitors = monitorCount(5,4);
console.log(numOfMonitors);

function multiplyByNineFifths(number) {
    return number * (9/5);
};

function getFahrenheit(celsius) {
    return multiplyByNineFifths(celsius) + 32;
};

getFahrenheit(15); // Returns 59


function monitorCount(rows, columns) {
    return rows * columns;
}
function costOfMonitors(rows,columns) {
    return monitorCount(rows, columns) * 200
};
const totalCost = costOfMonitors(5,4);
console.log(totalCost)


//variableName(argument1, argument2)

const plantNeedsWater = function(day) {
    if(day === 'Wednesday') {
        return true;
    }else {
        return false;
    };
};
plantNeedsWater('Tuesday');
console.log(plantNeedsWater('Tuesday'));

const rectangleArea = (width, height) => {
    let area = width * height;
    return area;
};

const plantNeedsWater = (day)=> {
    if (day === 'Wednesday') {
        return true;
    } else {
        return false;
    }
};

const squareNum = (num) => {
    return num * num;
};

const squareNum = num => num * num;

const plantNeedsWater = day =>
    day === 'Wednesday' ? true : false;
;