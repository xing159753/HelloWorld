let raceNumber = Math.floor(Math.random() * 1000);
let registeredEarly = true;
let age = 16;
if (age >= 18 && registeredEarly) {
    raceNumber += 1000;

}
if(raceNumber <= 1000 && age >= 18) {
    console.log(`9:30 and ${raceNumber}`);
}else if(raceNumber > 1000 && age >= 18) {
    console.log( `11:00 and ${raceNumber}`)
}else if (age < 18) {
    console.log( `12:30 and ${raceNumber}`)
}else {
    console.log('跑步者查看登记台。')
}



let raceNumber = Math.floor(Math.random() * 1000);
let early = true;
let age = 19;

if(early && age > 18){
    raceNumber += 1000;
}

if(early && age > 18){
    console.log(`Race wii begin at 9:30, your race number is: ${raceNumber}.`);
}
else if(early && age > 18){
    console.log(`Race will begin at 11:00, your race number is: ${raceNumber}.`);
}
else if(age < 18){
    console.log(`Race will begin at 12:30, your race number is : ${raceNumber}.`);
}
else{
    console.log(`Please approach the registration desk, thanks!`);
}