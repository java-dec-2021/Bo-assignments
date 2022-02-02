package com.bo.loginregistration.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.bo.loginregistration.models.User;
import com.bo.loginregistration.repositories.UserRepository;


@Component
public class UserValidator {
	@Autowired	// Need access to User Repository to see if the user is in the database 
	private UserRepository uRepo;
	
	// 
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			errors.rejectValue("password", "Match", "Passwords do not match!!!");
		}
		
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email has already been taken!");
		}
		
		if(user.getFirstName().equals("Bo")) {
			errors.rejectValue("firstName", "noBoAllowed", "Bo is not allowed to register at this time.");
		}
		
	}
	
	
	
	

}
