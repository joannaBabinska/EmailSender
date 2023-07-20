package com.babinska.emailsender.email;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmailSenderService {

  private final JavaMailSender javaMailSender;

  public void sendEmail(String toEmail, String subject, String body) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("joannababinskatutor@gmail.com");
    message.setTo(toEmail);
    message.setText(body);
    message.setSubject(subject);

    javaMailSender.send(message);
  }

}
