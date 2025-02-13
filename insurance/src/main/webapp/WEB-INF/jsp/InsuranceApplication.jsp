<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SafeGuard Insurance</title>
<link rel="StyleSheet" href="/css/InsuranceApplication.css">

</head>
<body>

	<p style="font-size: 32px; color:white; font-family:arial;"><% out.print("Welcome , " + session.getAttribute("username")); %></p>
	

	 <form action = "https://www.paypal.com/signin" id="form" method = "post">

        <div id="inputBoxes">

            <h1 id="signUpTitle">SafeGuard Insurance</h1>

    <label id="startDate" for="date">Enter the Start Date</label>

    <br>

    <input type="date" name="date" id="date" class="inputBox">

    <br><br>

    <label for="plans" id="plansLabel">Choose the plans / month</label>

    <br>

    <select  name="plans" id="" class="inputBox" required>

        <option disabled selected value=""></option>
        <option value="" >2000</option>
        <option value="">3000</option>
        <option value="">5000</option>
        <option value="">7000</option>
        <option value="">10000</option>

    </select>

    <br><br>

    <label id="genderLabel">Choose your gender</label>

    <br><br>

    <input type="radio" class="gender" id="male" id="male" name="genderRadio">
    <label for="male" class="genderLabels" id="maleLabel">Male</label>

    <br><br>

    <input type="radio" class="gender" id="female" name="genderRadio">
    <label for="female" class="genderLabels">Female</label>

    <br><br>

    <label for="" id="typeOfInsuranceLabel">Choose the type of insurance</label>
    <br>
    <select name="" class="inputBox" id="" required>

        <option value="" disabled selected></option>
        <option value="">Term Insurance</option>
        <option value="">Health Insurance</option>
        <option value="">Motor Insurance</option>
        <option value="">Personal Insurance</option>

    </select>

    <br><br>

    <input type="checkbox" id="seniorCitizen">
    <label for="seniorCitizen" id="seniorCitizenLabel">I am a senior citizen</label>

    <br><br>

    <input type="checkbox" id="terms" required>
    <label for="terms" id="termsLabel">I accept the terms and conditions</label>

    <br><br>

    <input type="submit" value="Make Payment" class="inputBox" id="signUp">

    </div>

    </form>

</body>
</html>