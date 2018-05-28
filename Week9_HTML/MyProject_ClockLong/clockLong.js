
var stop1, stop2;

/*-------- 36H clock ----------*/
function myFunction_36h() {
	// change button color
	document.getElementById("changeTo36h").style.background = "#0a690e";
	document.getElementById("changeTo48h").style.background = "#4CAF50";

	var myDate = new Date();
	var offset = myDate.getTimezoneOffset() * 60 ;

	var withOffset = myDate.getTime()/1000;
	var withoutOffset = withOffset - offset;

	// set time and show
    document.getElementById("demo_hour").innerHTML = secondsToString(withoutOffset, 36);
	document.getElementById("date-month-year").innerHTML = dateMonthYear();
	document.getElementById("today_withoutOffset").innerHTML = secondsToString(withoutOffset, 24);

    stop1 =setTimeout(myFunction_36h, 1000);
}

/*-------- 48H clock ----------*/

function myFunction_48h(){
	// change button color
	document.getElementById("changeTo48h").style.background = "#0a690e";
	document.getElementById("changeTo36h").style.background = "#4CAF50";
	
	var myDate = new Date();
	var offset = myDate.getTimezoneOffset() * 60 ;

	var withOffset = myDate.getTime()/1000;
	var withoutOffset = withOffset - offset;

	// set time and show
	document.getElementById("demo_hour").innerHTML = secondsToString(withoutOffset, 48);
	document.getElementById("date-month-year").innerHTML = dateMonthYear();
	document.getElementById("today_withoutOffset").innerHTML = secondsToString(withoutOffset, 24);

	stop2 =setTimeout(myFunction_48h, 1000);
}

function dateMonthYear(){
	var today = new Date();
	var years = today.getFullYear();
	return getDate() +" "+ getMonth() +" "+ years;
}

/* -------------- Convert miliseconds to hours, mins, secs -------------- */
/*31536000 sec:a year, 86400 sec: a day, 3600 sec: a hour*/

function secondsToString(timeInMillis, nhours)
{	
	var secPerHour;
	if(nhours == 24){
		secPerHour = 3600;
	} else if (nhours == 36){
		secPerHour = 2400;
	} else if (nhours == 48){
		secPerHour = 1800;
	} 

	var numhours = Math.floor(((timeInMillis  % 31536000) % 86400) / secPerHour);	// 0-24 hours expression
	var numminutes = Math.floor((((timeInMillis  % 31536000) % 86400) % secPerHour) / 60);
	var numseconds = Math.floor((((timeInMillis  % 31536000) % 86400) % secPerHour) % 60);

	if(nhours == 24){
		numhours = dsp_Hours24(numhours);
	} else if (nhours == 36){
		numhours = dsp_Hours36(numhours);
	} else if (nhours == 48){
		numhours = dsp_Hours48(numhours);
	}

	numhours = checkTime(numhours);
	numminutes = checkTime(numminutes);
	numseconds = checkTime(numseconds);

	return numhours + ":" + numminutes + ":" + numseconds;
}

function getMonth() {
    var d = new Date();
    var month = new Array(11);
    month[0] = "January";
    month[1] = "February";
    month[2] = "March";
    month[3] = "April";
    month[4] = "May";
    month[5] = "June";
    month[6] = "July";
    month[7] = "August";
    month[8] = "September";
    month[9] = "October";
    month[10] = "November";
    month[11] = "December";

    var n = month[d.getMonth()];
    return  n;
}

function getDate() {
    var d = new Date();
    var weekday = new Array(7);
    weekday[0] = "Sunday";
    weekday[1] = "Monday";
    weekday[2] = "Tuesday";
    weekday[3] = "Wednesday";
    weekday[4] = "Thursday";
    weekday[5] = "Friday";
    weekday[6] = "Saturday";

    var n = weekday[d.getDay()];
    return n;
}

function checkTime(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
}

/*--------- Control Clock to Stop -------*/

function stop36hClock(){
	if (stop1) {
		clearTimeout(stop1);
	}
}

function stop48hClock(){
	if (stop2) {
		clearTimeout(stop2);
	}
}

/*--------- Control AM/PM -------*/

var t_flg=true;

function changeAMPM(){
	var btn = document.getElementById("changeTimeMode");
	var mode36h = document.getElementById("changeTo36h");
	var mode48h = document.getElementById("changeTo48h");

	if(btn.checked){
		if(mode36h){
			// dsp_Hours36(numhours);
		}
		else if(mode48h){

		}
	} else {
		// bring back 24h mode
	}
}

function dsp_Hours24(_hour) {
  if (t_flg || (_hour > 0 && _hour < 13)) {
    if (_hour == "0") _hour = 12;
    return (_hour);
  }
  if (_hour == 0) {
    return (12);
  }
  return (_hour-12);
}

function dsp_Hours36(_hour) {
  if (t_flg || (_hour > 0 && _hour < 13)) {
    if (_hour == "0") _hour = 12;
    return (_hour);
  }
  if (_hour == 0) {
    return (12);
  }
  return (_hour-12);
}

function dsp_Hours48(_hour) {
  if (t_flg || (_hour > 0 && _hour < 13)) {
    if (_hour == "0") _hour = 12;
    return (_hour);
  }

  if (_hour == 0) {
    return (12);
  }

  return (_hour-12);
}

function dsp_AmPm() {
  if (t_flg) {
    return ("");
  }

  if (now.getHours() < 12) {
    return (" AM");
  }
  
  return (" PM");
}