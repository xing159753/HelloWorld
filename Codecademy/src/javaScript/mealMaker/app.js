// const menu = {
//     _meal:"",
//     _price: "",
//     set mealToCheck(_meal) {
//         if(typeof this.mealToCheck == 'string') {
//             return _meal = mealToCheck
//         }
//     },
//     set priceToCheck(_price){
//         if(typeof this.priceToCheck == 'number' ) {
//             return price = priceToCheck
//         }
//     },
//     get todaysSpecial() {
//         if(_meal == "" && _price ==0 ){
//             'Meal or price was not set correctly!'
//         } else {
//             'Today’s Special is Spaghetti for $5!'
//         }
//     }
// };
//
// menu._meal = "m";
// menu._price = "p";
// menu.mealToCheck = "if";
// menu.priceToCheck = 123;
// console.log(menu)

const menu = {
    _menu: '',
    _price: 0,

    set meal(mealToCheck) {
        if (typeof mealToCheck === 'string') {
            return this._meal = mealToCheck;
        }
    },

    set price(priceToCheck) {
        if (typeof priceToCheck === 'number') {

            return this._price = priceToCheck;
        }
    },

    get todaySpecial(){
    if(this._meal && this._price) {
        return `Today's Meal is ${this._meal} for $${this._price}!`
    } else {
        return `Meal or price not set correctly!`
    }
    }

};

menu._meal = 'Pizza';
menu._price = 8;
console.log(menu.todaysSpecial);