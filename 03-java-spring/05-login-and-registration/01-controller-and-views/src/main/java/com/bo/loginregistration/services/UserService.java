package com.bo.loginregistration.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.loginregistration.models.User;
import com.bo.loginregistration.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public List<User> getAllUsers() {
		return this.uRepo.findAll();
	}
	
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	public User registerUser(User user) {
		// Generate the hash
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		// Set the hashed password on the users password field.
		user.setPassword(hash);
		// Save that new user password and the user object to the database
		return this.uRepo.save(user);
	}
	
	public boolean authenticateUser(String email, String password) {
		// Query the user by email
		User user = this.uRepo.findByEmail(email);
		
		// If the user does not exists, we are going to return false and exit out.
		if(user == null) {
			return false;
		}
		
		// IF we do find the email, we need to check if the email and password is correct.
		// Check provided email against email in database.
		return BCrypt.checkpw(password, user.getPassword());
	}
	
	public User getUserByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	

}

























