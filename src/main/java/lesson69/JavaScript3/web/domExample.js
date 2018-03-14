var ourWindow = window;
var ourLocation = location;
var ourNavigator = navigator;
var ourHistory = history;
var ourScreen = screen;
var ourDoc = ourWindow.document;
ourDoc.addEventListener('DOMContentLoaded', domExperiment);
console.log("Root script");

function domExperiment(){
	console.log("Experimental function started");
	console.log(ourWindow);
	console.log(ourLocation);
	console.log(ourNavigator);
	console.log(ourHistory);
	console.log(ourScreen);
	console.log("-----------------");
	console.log("width = " + ourScreen.width);
	
	var button = ourDoc.createElement("BUTTON");
	button.innerHTML = "Button";
	document.body.appendChild(button);
	
	var div = ourDoc.createElement("div");
	div.innerHTML = "Div content";
	div.setAttribute("style", "background-color: green")
	document.body.appendChild(div);
	
	var fignya = ourDoc.createElement("fignya");
	document.body.appendChild(fignya);
	
	button.addEventListener("click", function (){
		console.log("clicked");
	});
}
