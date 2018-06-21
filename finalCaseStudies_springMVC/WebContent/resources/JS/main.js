function openRole(RoleName) {
    var i;
    var x = document.getElementsByClassName("role");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none"; 
    }
    document.getElementById(RoleName).style.display = "block"; 
}
