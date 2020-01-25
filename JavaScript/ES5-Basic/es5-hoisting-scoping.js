/*
// hoisting
var age = calculateAge(2000);
console.log(age);

function calculateAge(year){
    return 2020-year;
}

//var age = calculateAge(2000);
//console.log(age);

// var age = calc_age(2000);
// console.log(age);

// function expression
var calc_age = function(year){
    return 2020 - year;
}

var age = calc_age(2000);
console.log(age);

*/

// Scoping
/*
var g = "Hi";
//console.log(g);

first();

function first(){
    // console.log(g); // undefined : only one scope is active
    var g = "Hello";
    console.log("First : " + g);
    second();

    // nested function
    function second(){
        var l = "Bye";
        console.log("Second : " + g + l); // second is in scope of first
        third();
    }
}

function third(){
    var o = "Available";
    console.log("Third : " + g);
    // console.log(l); // third does not comes in scope of second
    console.log("Third : " + o);
}

//console.log(g);
*/

// this reference
console.log(this); // global scope
var g = 10; // global var
console.log(g);

// calculateAge(2000);

//  console.log(g);
// console.log(this);

function calculateAge(year){
    console.log("inside function");
    // var g = 30; // overriding
    g = 30;
    console.log(this); // local scope
    // this = "Hello"; // read-only
}

var first = {
    name : "First",
    age : 20,
    calculateAge : function(year){
        console.log("Inside Calculate of object");
        console.log(g); // global
        console.log(this);
    }
}

first.calculateAge();