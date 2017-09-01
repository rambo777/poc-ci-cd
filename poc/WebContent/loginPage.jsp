<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Assessment Planning Tool - Zensar Technologies Ltd.</title>
 <link rel="stylesheet" type="text/css" href="css/jalert.css" />
 <link rel="stylesheet" href="css/style2.css">
 <title>ZenDevOps Login</title>
 <script type="text/javascript">
	function passwordEmpty(){
		if(loginForm.password.value!=""){
			loginForm.password.value="";
			return true;
		}
	}
	function userIdEmpty(){
		if(loginForm.userId.value!=""){
			loginForm.userId.value="";
			return true;
		}
	}
 </script>
 </head>
  <body>
    <div class="wrapper">
	<div class="ZenDevOpsLogoArea" style="height: 283px; width: 627px; "></div>
	<div class="container">
		
		<form class="form" name="loginForm" method="post" action="LoginServlet"  onsubmit="return validate()" >
		<h1 style="padding-bottom:20px;">Welcome</h1>
		<label>login ID</label>	<input type="text" name="userId" id="userId" value="ab12345" onclick="return userIdEmpty()">
		<label>Password</label>	<input type="password"  name="password" id="password"  onclick="return passwordEmpty()"><br>
			<button type="submit" class="login-button" id="loginBtn">Login</button>
			<p class="message" align="right"  id="msg"></p>   
			    
		</form>
	<!--       Alert box-->  
	<script type="text/javascript" src="jQuery/jquery.js"></script>
	<script type="text/javascript" src="jQuery/jquery.jalert.packed.js"></script>
<script type="text/javascript">
	$(document).ready(function()
	{//have an alert box displayed on body load.
		<c:choose>
			<c:when test="${not empty error}">
				$('#msg').jAlert('${error}', "fatal", 'errboxid');
			</c:when>
		</c:choose>
 	 //Validation on save button on an action
	$('#loginBtn').click(function (e){
		var isValid = true;
		$('#userId').each(function() {
			if ($.trim($('#userId').val()) == '') {
				$('#msg').jAlert('Enter the Login Id ', "warning", 'warningboxid');
				$(this).css({ "border": "1px solid red","background": "#FFCECE"});
				e.preventDefault();
			}
			else {
				$(this).css({"border": "","background": ""});
				
			}
		});
		$('#password').each(function() {
			if ($.trim($('#password').val()) == '') {
				$('#msg').jAlert('Enter the password ', "warning", 'warningboxid');
				$(this).css({ "border": "1px solid red","background": "#FFCECE"});
				e.preventDefault();
			}
			else {
				$(this).css({"border": "","background": ""});
				
			}
		});
	});
});
</script>
	</div>
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>
 <!--     <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script> --> 
    <script src="js/index.js"></script>

  </body>
</html>
