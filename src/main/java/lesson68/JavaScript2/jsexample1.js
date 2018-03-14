//var sayMeow = "МяуМяуМяуМяуМяуМяу";
function sayMeow() {
	alert("МяуМяуМяуМяуМяуМяу");
}

function doCommand(command) {
	if (typeof command == 'function') {
		command();
	} else {
		alert(command);
	}
}

function showTypes() {
	var a2;
	var a = [1,2];
	console.log(Math.LN10);
	console.log(typeof "Hello");
	console.log('Hello'.substring(2,5));
	console.log('Hello'[0]);
	console.log(typeof 'A');
	console.log(typeof sayMeow);
	console.log(typeof sayMeow());
	console.log(typeof 10);	
	console.log(typeof Symbol('A'));	
	console.log(typeof 10000000000000);
	console.log(typeof 1.7);
	console.log(typeof false);
	console.log(typeof true + 1);
	console.log(typeof a);
	console.log(typeof null);
	
	if (a2 == undefined) {
		console.log("1");
	}
}

function printChessBoard() {
	document.writeln("<br/>");
	document.writeln("<br/>");
	document.writeln("<table>");
	for (var i = 0; i < 8; i++) {
		document.writeln("<tr>");
		for (var j = 0; j < 8; j++) {
			document.writeln('<td>');
			document.writeln("</td>");
		}
		document.writeln("</tr>");
	}
	document.writeln("</table>");
}
