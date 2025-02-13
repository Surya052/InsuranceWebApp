<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forget Password</title>
<link rel="StyleSheet" href="/css/ForgetPassword.css">

</head>
<body>

	 <form action ="/index/setnewpassword" method = "post">

        <div id="inputBoxes">

            <h2 id="signUpTitle">Forget Password</h1>

                

    <input type="tel" name="mobile" class="inputBox" placeholder="Enter mobile number">

    <br><br>

    <input type="password" name="password1" class="inputBox" placeholder="Enter New Password">

    <br><br>


    <input type="password" name="password2" class = "inputBox" placeholder="Re-enter Password">

    <br><br><br>

	<input type="submit" value="Change Password" class="inputBox" id="signUp">
    </div>

    </form>

</body>
</html>