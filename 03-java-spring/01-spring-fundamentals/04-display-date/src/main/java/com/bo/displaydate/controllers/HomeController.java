package com.bo.displaydate.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class HomeController {
//	@RequestMapping("/")
//	public String dashboard() {
//		return "dashboard.jsp";
//	}
//}

@Controller
public class HomeController {
@RequestMapping("/")
	public String dashboard() {
//		Date date = new Date();
//		model.addAttribute("rightNow", date);
		return "dashboard.jsp";
	}
	@RequestMapping("/{dort}")
	public String datetime(Model model, @PathVariable("dort") String dtt) {
//		if(!dtt.equals("date") && !dtt.equals("time"))
//			return "redirect:/";
//		SimpleDateFormat dm = (dtt.equals("date")) ? new SimpleDateFormat("E, 'the' dd 'of' MMM, Y") : new SimpleDateFormat("h:mm a");
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter datetime = (dtt.equals("date")) ? DateTimeFormatter.ofPattern("E, 'the' dd 'of' MMM, Y") : DateTimeFormatter.ofPattern("h:mma");
		model.addAttribute("dt", dtt);
		model.addAttribute("dtFormat", datetime.format(now));
		return "datetime.jsp";
	}
	
	@RequestMapping("/home")
	public String test() {
		return "redirect:/";
	}
		
	
	
	
}

