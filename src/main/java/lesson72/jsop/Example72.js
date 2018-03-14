/**
 * 
 */
"Привет, мир!".length;  //тип String
"Привет, мир!".toUpperCase(); //и прочие типичные для стринга методы 
["Mocart", "Bah", "Vivaldi"].forEach(console.log) //и прочие типичные для списка\очереди\стэка методы. Например pop push shift unshift sort...
console.log( 12.355.toFixed(1) ); // 12.0 тип Number
console.log( 12..toFixed(1) ); // 12.0

var myObject = {};
var myObject2 = new Object();
myObject.newProperty="something";
myObject.newProprety="updatedValue";

delete myObject.newProprety;

myObject.firstMethod = function() {
	var a = 3;
	var b = 5;
	console.log(b / a + this.newProperty);
}

myObject.firstMethod();
myObject2.firstMethod = myObject.firstMethod;
myObject2.firstMethod();

console.log('--------------------');
var massiv = [1, "Mocart", 3, 4, 5];
for (var prop in myObject) {
	console.log(prop + " = " + myObject[prop]);
}
console.log('--------------------');
if ("newProperty" in myObject) {
	console.log(myObject.newProperty);
} else console.log("No");

console.log(myObject.asdasdas); //ok
//console.log(myObject.asdasdas.iodsjf); //not ok

if ("newProperty" in myObject) {
	console.log(myObject.newProperty);
} else console.log("No");

myObject.svoystvo = "New Value";
//myObject[svoystvo] = "New Value again";

var user0 = {
		name: "Vasya",
		sex: "malchik",
		action: function() {console.log("smotryu futbol")}
};

var user1 = {
		name: "Vasya",
		sex: "male",
		action: function() { console.log("football"); }
};

var user3 = {
		name: "Ella",
		sex: "female",
		action: function() { console.log("milena"); }
};

var arr = [];
arr[1000] = "value";
arr[1000] = undefined;
alert(arr.length); //1001

var arr2 = {length: 0};
