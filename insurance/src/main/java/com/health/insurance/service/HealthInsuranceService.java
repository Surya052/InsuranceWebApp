package com.health.insurance.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.health.insurance.entity.HealthInsuranceEntity;
import com.health.insurance.entity.HealthInsuranceRepository;
import com.health.insurance.service.exception.BlankException;


@Service
@Component
public class HealthInsuranceService {
	
	@Autowired
	HealthInsuranceRepository repo;


	public List<HealthInsuranceEntity> findUser(Long user , String password) {
		
		List<HealthInsuranceEntity> usersArrayList = new ArrayList<>();
		
		usersArrayList = repo.findAllByMobile(user);
		
		if(usersArrayList.size() > 0)
			return usersArrayList;
		
		return null;
		
	}


	public String setNewPassword(String password1 , String password2 , Long mobile) {

		
		if(password1.equals(password2)) {
			
			List<HealthInsuranceEntity> changePassword = repo.findAllByMobile(mobile);
			
			if(changePassword.size() == 1) {
				
				changePassword.get(0).setPassword(password2);
				repo.save(changePassword.get(0));
				return "Password Changed Successfully";
			}
			
			else
				return "User doesnot exist";
		}
		return "Password doesn't matches";
	}


	public String signUpNewUser(String name,String mobile,String password1,String password2,String dob,String email) {
		
		if(password1.equals(password2)) {
			
			if(name.isEmpty()) {
				throw new BlankException("userName Should not be blank");
			}
			
			repo.save(new HealthInsuranceEntity(name,Long.valueOf(mobile),password1,LocalDate.parse(dob),email));
			
			return "success";
		}
		
		else
			return "fail";

	}
}
