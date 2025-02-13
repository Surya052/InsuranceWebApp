<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SafeGuard Health Insurance</title>
<link rel="stylesheet" href="/css/Home.css" >
	
</head>
<body>
	
    <a id="aboutUs" href="/index/aboutus">About us</a>

	<a id="terms" href="/index/privacyterms">Privacy Policy/Terms & Conditions</a>

	<a id="career" href="https://www.naukri.com/safeguard-jobs-in-chennai?k=safeguard&l=chennai&nignbevent_src=jobsearchDeskGNB">Career</a>

	<a id="contactUs" href="/index/contactus">Contact us</a>
    
    <form action="/index/loggeduser">
		
		<img src="/healthLogo.jpg" alt="Error Occured" id="logoImage">
		
		<h2 id="safeguardTitle">
			SafeGuard Insurance
		</h2>

		<div id="inputBoxes">

			<h1>
				Sign In
			</h1>

		<input name="user" class="inputBox" type="tel"  placeholder="Mobile number">

		<br><br>

		<input name="password" class="inputBox" type="password" placeholder="Password">

		<br>
		
		<input type="submit" value = "Sign In" id="signIn">

		<br><br>

		<a id="forgotPassword" href="/index/forgetpassword">Forgot password?</a>

		<br><br>

		<div id="signUp">
		
		New to SafeGuard? <a id="signUpNow" href="/index/signup">Sign up now</a>


		</div>

		</div>
		</form>
</body>
</html>