package com.bo.loginregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bo.loginregistration.models.User;
import com.bo.loginregistration.services.UserService;
import com.bo.loginregistration.validators.UserValidator;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "loginregistration.jsp";
	}
	
	@PostMapping("/registerUser")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		if(result.hasErrors()) {
			return "loginregistration.jsp";
		}
		User newUser = this.userService.registerUser(user);
		session.setAttribute("user__id", newUser.getId());
		return "redirect:/";
	}
	
	
	@PostMapping("/login")
	public String login(HttpSession session, @RequestParam("lemail") String email, @RequestParam("lpassword") String password, RedirectAttributes redirectAttr) {
		if(!this.userService.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		
		User userToBeLoggedIn = this.userService.getUserByEmail(email);
		session.setAttribute("user__id", userToBeLoggedIn.getId());
		return "index.jsp";
	}	
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
	
	
}
