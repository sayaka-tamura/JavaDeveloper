
function myFunction() {
    // Date dd Month yyyy
    var today = new Date();
    //var date = today.getDate();
    //var month = today.getMonth();
    var year = today.getFullYear();
    
    // HH:MM::SS
    var hour = today.getHours();
    var min = today.getMinutes();
    var sec = today.getSeconds();
    
    min = checkTime(min);
    sec = checkTime(sec);
    
    // For 36 hours Clock
    var hour_36 = 1.5*(today.getHours());
    if(hour36>=24){
        
    }

    var float_hour_36 = getDecimal(hour_36);
        
    var min_36 = 1.5*(today.getMinutes() + float_hour_36);
    var float_min_36 = getDecimal(min_36);  
    
    // var sec_36 = 1.5*(today.getSeconds() + float_min_36);
 
    document.getElementById("demo_date").innerHTML = getDate() +" " + date +" "+ getMonth() +" " + year;
    document.getElementById("demo_hour_24").innerHTML = "Time: " + hour + ":" + min + ":" + sec;
    
    document.getElementById("demo_hour_36").innerHTML = "Time*1.5 : " + hour_36 + ":" + min_36;         // + ":" + (sec_36+getDecimal(min_36))
    
    document.getElementById("demo_float_hour").innerHTML = "float of hour_36: " + getDecimal(hour_36);
    document.getElementById("demo_float_min").innerHTML = "float of min_36: " + getDecimal(min_36);
     
    var t = setTimeout(myFunction, 10);
}

function checkTime(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
}

function getDecimal(n) {
    return (n - Math.floor(n));
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

