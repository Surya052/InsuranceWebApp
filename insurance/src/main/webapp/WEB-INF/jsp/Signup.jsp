<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>
<link rel="stylesheet" href="/css/Signup.css">

</head>
<body>	

    <form action = "/index/signupnewuser" id="form" method = "post">

        <div id="inputBoxes">

            <h1 id="signUpTitle">SIGN UP</h1>

    <input type="text" name="name" id="name" class="inputBox" placeholder="Enter Name">

    <br><br>


    <input type="tel" name="mobile" id="mobile" class = "inputBox" placeholder="Enter mobile number">

    <br><br>

    <input type="password" name="password1" id="password" class="inputBox" placeholder="Enter Password">

    <br><br>

    <input type="password" name="password2" id="verifyPassword" class="inputBox" placeholder="Re-Enter Password">

    <br><br>

    <input type="date" name = "dob" id="dob" class="inputBox">

    <br><br>

    <input type="email" name="email" id="email" class="inputBox" placeholder="Enter Email">

    <br><br>

    <input type="submit" value="Sign up" class="inputBox" id="signUp">

    </div>

    </form>
	
</body>
</html>