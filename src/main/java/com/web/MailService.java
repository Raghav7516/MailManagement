package com.web;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public Response<String> sendMail() {
		MimeMessage message=javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper=new MimeMessageHelper(message, true);
			helper.setTo("kushwah.pawan1@gmail.com");
			helper.setSubject("hello");
			helper.setFrom("pawan.k@contus.in");
			helper.setText("whatsaap");
			if (file!=null) {
				helper.addAttachment(file.getOriginalFilename(), new InputStreamSource() {
					
					@Override
					public InputStream getInputStream() throws IOException {
						return file.getInputStream();
					}
				});
			}
			javaMailSender.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
