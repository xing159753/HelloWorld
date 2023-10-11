// // 年龄
// let myAge = 18;
// //2
// let earlyYears = 2;
// earlyYears *= earlyYears;
// // 由于我们已经计算了前两年，因此取该myAge变量并从中减去 2。
// let laterYears = myAge - 2;
// // 将laterYears变量乘以 4，即可计算出您晚年所占的狗年数。使用乘法赋值运算符一步完成乘法和赋值。
// laterYears *= 4;
//
// console.log(earlyYears);
// console.log(laterYears);
//
// // 将earlyYears和加laterYears在一起
// myAgeInDogYears = earlyYears + laterYears;
// // 名字
// myName = 'wangze'.toLowerCase();
//
// console.log(`My name is ${myName}. I am ${myAgeInDogYears} AGE years old in human years which is DOG AGE years old in dog years.`)

//my current age
const myAge = 20;
// early years
let earlyYears = 2;
earlyYears *= 10.5;
let laterYears = myAge - 2;
laterYears *= 4;

console.log(earlyYears);
console.log(laterYears);

let myAgeInDogYears = earlyYears + laterYears;

let myName = "Bryan".toLowerCase();

console.log(`My name is ${myName}. I am ${myAgeInDogYears} years old in dog years.`);