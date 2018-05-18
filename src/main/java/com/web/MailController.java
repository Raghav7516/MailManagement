package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	@Autowired
	private MailService mailService;
	
	@GetMapping("/mail")
	public Response<String> sendMail(){
		
		return mailService.sendMail();
	}
}
