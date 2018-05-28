// Toggle Button
/* ------ Change backgroundColor ------ */
function changeBackGroundColor(){
	var btn = document.getElementById("change-bg-color");

	if(btn.checked){
		document.body.style.backgroundColor = firstColour();
		document.getElementById("background").style.color = "#fff";
	} else {
		document.body.style.backgroundColor = bgWhiteColor();
		document.getElementById("background").style.color = "#000";
	}

}

function firstColour(){
    randomColourOne = "#000000".replace(/0/g,function(){return (~~(Math.random()*16)).toString(16);});
    
    randomColourTwo = "#000000".replace(/0/g,function(){return (~~(Math.random()*16)).toString(16);});
    
    var background = document.getElementById("background");
    background.style.backgroundImage = "-webkit-linear-gradient("+ randomColourOne +" , "+ randomColourTwo +")";
}

function bgWhiteColor(){
	var background = document.getElementById("background");
    background.style.backgroundImage = "-webkit-linear-gradient(white, white)";
}

/* ------ End  Change backgroundColor ------ */