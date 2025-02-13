package com.health.insurance.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.health.insurance.entity.HealthInsuranceEntity;
import com.health.insurance.entity.HealthInsuranceRepository;
import com.health.insurance.service.HealthInsuranceService;
import com.health.insurance.service.exception.BlankException;
import com.health.insurance.service.exception.ErrorDetails;

import jakarta.servlet.http.HttpSession;


	@RestController
	@RequestMapping("/index")
	public class HealthInsuranceController {
		
		@Autowired
		HealthInsuranceService ser;	
		
		@Autowired
		HealthInsuranceRepository repo;
		
		
		@GetMapping("/home")
		public ModelAndView home() {
			return new ModelAndView("Home");
		}
		
		@GetMapping("/signup")
		public ModelAndView signUp() {
			return new ModelAndView("Signup");
		}
		
		@GetMapping("/aboutus")
		public ModelAndView aboutUs() {
			return new ModelAndView("Aboutus");
		}
		
		@GetMapping("/privacyterms")
		public ModelAndView privacyTerms() {
			return new ModelAndView("PrivacyTerms");
		}
		
		@GetMapping("/contactus")
		public ModelAndView contactUs() {
			return new ModelAndView("ContactUs");
			
		}
		
		@GetMapping("/forgetpassword")
		public ModelAndView forgetPassword() {
			return new ModelAndView("ForgetPassword");
		}
		
		
		@PostMapping("/setnewpassword")
		public String setNewPassword(@RequestParam("password1") String password1 , @RequestParam("password2") String password2 , @RequestParam("mobile") String mobile) {
			
			return ser.setNewPassword(password1,password2,Long.parseLong(mobile));
			
		}
		
		@PostMapping("/signupnewuser")
		public String signUpNewUser(@RequestParam("name") String name , @RequestParam("mobile") String mobile, @RequestParam("password1") String password1 , @RequestParam("password2") String password2 , @RequestParam("dob") String dob , @RequestParam("email") String email) {
			
			if(ser.signUpNewUser(name,mobile,password1,password2,dob,email).equals("success")) {
				return "User Created Successfully";
			}
			
			else
				return "Password does not match";
			
		}
		
		@GetMapping("/error")
		public ModelAndView errorPage() {
			
			return new ModelAndView("Error");
			
		}
		

		@GetMapping("/loggeduser")
		public ModelAndView print(@RequestParam("user") String user , @RequestParam("password") String password , HttpSession session) {
			
			List<HealthInsuranceEntity> usersList = new ArrayList<>();
			
			usersList = ser.findUser(Long.parseLong(user), password);
			
			if(usersList.size() == 0 )
				return new ModelAndView("Error");
			
			if(!usersList.get(0).getPassword().equals(password))
				return new ModelAndView("Error");
			
			else {
				session.setAttribute("username", usersList.get(0).getUsername());
				return new ModelAndView("InsuranceApplication");
			}
		
		}
		
		@ExceptionHandler(value=BlankException.class)
		public ErrorDetails blankException(BlankException blankException) {
			
			ErrorDetails errorDetails = new ErrorDetails();
			
			errorDetails.setErrorCode(HttpStatus.NOT_ACCEPTABLE.value());
			errorDetails.setResponseEntity(HttpStatus.NOT_ACCEPTABLE);
			errorDetails.setTimeStamp(LocalDateTime.now());
			errorDetails.setErrorMessage(blankException.getMessage());
			return errorDetails;
		}
	
		
	}