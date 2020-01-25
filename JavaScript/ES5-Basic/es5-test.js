console.log("Hello...");
// not type bounded
// var a = "Hello";  // Strings can be specified in Double/Single quotes
// console.log(a);
console.log(b);
var b = 20;
// coercing : mutation
// Coercing : converting to another type
var fruit = "Apple";
var cost = 100;
var quality = "A";
console.log("Fruit : " + fruit + " costs " + cost + " Rs/- per kg, but quality is " + quality);
// Mutation : making a ref refer to another type of data
// var a = 23.5;  // redeclaration
a = 23.5;  // mutation
console.log(a);
var c;  // no declaration
console.log(c);
// all standard high level operators
// typeof
var str = "Hello";
var age = 20;
var gpa = 3.5;
var dummy = null;
var state = true;
console.log(typeof str);
console.log(typeof age);
console.log(typeof gpa);
console.log(typeof dummy);
console.log(typeof xyz); // never declared
console.log(typeof "Some data");
console.log(state);

*/

// Constructs : 
// if-else
/*
var a = 20;
var b = 30;
var c = 40;
if( a>b ){
    console.log("a is bigger");
}else{
    console.log("b is bigger");
}
var job = "developer";
switch(job){
    case 'designer':console.log("Needs Creativity...");break;
    case 'developer':console.log("Must be logically sound!!!");break;
    default : console.log("Must be adaptable...");
}
switch(a){
    case b> 20: console.log("test"); break;
    case b > 20 && b<30: console.log("test"); break;
    case b != 100: console.log("test"); break;
    case 30: case a > 20: console.log("test"); break;
}
var i = 1;
while(i<=5){
    console.log("Value : " + i);
    i++;
}
for(j = 0; j<5;j++){
    console.log("Value : " + j);
}
*/

//  Logical : truthy : falsey

// var height = null;
/*if(height ){
    console.log("Height is available");
}else{
    console.log("no height given");
}*/

// comparision : == / ===

// == : does type coercing
// === : type strict
/*
var width = 25;
if(width == "25"){
    console.log("Width is 25");
}else{
    console.log("Width is not 25");
}
*/


// Function

// function <function name>([argument names]){}
/*
function calcAge(yearOfBirth){
    return 2020 - yearOfBirth;
}
var age = calcAge(2000);
console.log("Age : " + age);
// anonymous function  : function expression syntax
var calc_age = function(yearOfBirth){
    return 2020 - yearOfBirth;
}
console.log(typeof calc_age);
var age = calc_age(2000);
console.log("Age : " + age);
// var calc_age_pro = calc_age; // function variable
var calc_age_pro = calcAge; // function name
var age = calc_age_pro(2000);
console.log("Age : " + age);
*/

// Arrays 
// var names[] = {};
/*
var names = ["First", "Second", "Third"];
var days = new Array("MON", "TUE");
console.log(typeof names);
console.log(typeof days);
console.log(names.length);
console.log(days.length);
console.log(names[2]);
console.log(names[3]);
// names[3] = "Fourth";
// console.log(names[3]);
names[5] = "Fourth";
console.log(names[5]);
console.log(names.length);
console.log(names);
names.push("New value");
console.log(names);
names.pop();
names.pop();
console.log(names);
names.unshift("Mr."); // reverse push
console.log(names);
names.shift(); // reverse pop
console.log(names);
var diff = ["First", 20, 23.5, true]; // hetrogenous
console.log(diff);
*/

// Classes and Objects
// Object Notation ~ No Real Class/Object

// first : reference reffering to an object notation
// first : object of anonymous class
/*var first = {
    // <field/member> : <value>
    name : "First",
    age  : 20,
    gpa  : 3.5
};
console.log(first.age);
console.log(first["gpa"]);
// first.grade = 4;
console.log(first.grade);
*/
// can have object with empty composition, which can be later on extended
/*var first = new Object();
first.firstName = "SomeName";
first.dob = "12/12/2000";
first.test = function(){
    console.log("This is a test method");
}
console.log(first.firstName);
console.log(first["dob"]);
*/
// adding methods
var first = {
    // <field/member> : <value>
    name : "First",
    age  : 20,
    gpa  : 3.5,
    calculateAge : function(year){
        return 2020 - year;
    }
};

console.log(first.age);
console.log(first["gpa"]);
first.grade = 4;
console.log(first.grade);
console.log(first.calculateAge(2000));
first.test = function(){
    console.log("This is a test method");
}

first.test();
