package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	@Autowired
	private MailService mailService;
	
	@PostMapping("/mail")
	public Response<String> sendMail(@RequetParam("file") MultipartFile file){
		
		return mailService.sendMail(file);
	}
}
