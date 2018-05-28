<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>First JSP Demo</title>
		<link rel="stylesheet" href="clockLong.css">
		<script src="clockLong.js"></script>
		<script src="setting.js"></script>
	</head>
	<body id="background" onload="myFunction_36h()">
    <div class="wrapper">
        <div id="clock">
            <div class="clocktitle">36 Hours Clock</div>
            <div id="clock">
                <div id="ampm">AM/PM</div>
                <div id="demo_hour"></div>
            </div>

            <div>Real time Clock</div>
            <div id="date-month-year"></div>
            <div id="today_withoutOffset"></div>
        </div>

        <div class="btn-group">
            <button class="button button_time active" id="changeTo36h" onclick="myFunction_36h(); stop48hClock()">36H</button>
            <button class="button button_time" id="changeTo48h"  onclick="myFunction_48h(); stop36hClock();">48H</button>
        </div>

        <div class="toggle-group">
            <div class="tgl-btn">
                <div>AM/PM</div>
                <label class="switch">
                    <input type="checkbox" id="changeTimeMode" onclick="changeAMPM()">
                    <span class="slider round"></span>
                </label>
            </div>

            <div class="tgl-btn">
                <div>Background Color</div>
                <label class="switch">
                    <input type="checkbox" id="change-bg-color" onclick="changeBackGroundColor()">
                    <span class="slider round"></span>
                </label>
            </div>
        </div>

    </div>
    <div>Welcome to JSP! This is now <%=new java.util.Date() %></div>
	<div>
		<%@ page import="thisthings.*" %>
		<%! int count = 0; %>
		<%
			Fafafa tc = new Fafafa();
			String x = tc.dothings();
			out.print(x);
		%>
	</div>
	<div><a href="http://tomcat.apache.org/" target="_blank">http://tomcat.apache.org/</a></div>
</body>
</html>