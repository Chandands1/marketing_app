package com.marketing.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Spring MVC, Spring Web

@Controller
public class LeadsController {
	
	//handler method
	//http://localhost:8080/view
	
	@RequestMapping("/view")
	public String viewCreateLeadForm() {
		
		return "creat_lead";
		//RequestDispatcher
	}
	
	

}
