package com.bo.loginregistration.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max=15)
	private String firstName;
	
	@NotBlank
	@Size(max=30)
	private String lastName;
	
	@Email	// Regex pattern validator for emails
	@NotBlank 	// Redundant because @Email will already check if the information is empty or not.  Not neccessary to have @NotBlank.
	private String email;
	
	// Can have @Size(max=10) or @Regex however we are going to handle validations for password in the back-end.
	private String password;
	
	@Transient	// Make sure you are importing: javax.persistence.Transient;  We don't want this to be stored in the database.  Transient means that the item will not be stored on the database.  
	private String confirmPassword;
	
	
	
	
	
	
	
	
	public User() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	