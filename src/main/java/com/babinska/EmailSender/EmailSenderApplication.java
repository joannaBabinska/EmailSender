package com.babinska.EmailSender;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class EmailSenderApplication {

	private final EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail(){
		senderService.sendEmail("babinskaasia52@gmail.com", "Test", "Udało sie :)");
	}

}
