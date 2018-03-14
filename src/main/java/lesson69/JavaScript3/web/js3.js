/**
 * 
 */
var array = [1, 2, 3];

for (let i in array) {
	console.log(i);
}

console.log(2 in [1, 4, 3]);
console.log(4 in [1, 2, 3]);
//doCommand(1);

function doCommand(number) {
	console.log(number);
	number += 3;
	for (var i = (console.log("Start"), 0); i < 10; i++) {
		console.log(i);
	}
}