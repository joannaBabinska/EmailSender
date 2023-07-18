package com.babinska.EmailSender;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailSenderService {

  private final JavaMailSender javaMailSender;

  public void sendEmail(String toEmail, String subject, String body) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("joannababinskatutor@gmail.com");
    message.setTo(toEmail);
    message.setText(body);
    message.setSubject(subject);

    javaMailSender.send(message);
    log.info("Mail sent successfully");

  }
}
