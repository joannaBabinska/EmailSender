package com.babinska.emailsender.mq;

import com.babinska.emailsender.Student.Student;
import com.babinska.emailsender.email.EmailSenderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQJsonConsumer {
  private static final String DEV_EMAIL = 	"joannababinskatutor@gmail.com";
  private final EmailSenderService emailSenderService;

  @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
  public void sendWelcomeEmail(Student student){
    log.info("Send welcome email :" + student.toString());
    emailSenderService.sendEmail(DEV_EMAIL, "Welcome email", student.toString());
  }

}
