package com.babinska.emailsender.mq;

import com.babinska.emailsender.email.Email;
import com.babinska.emailsender.email.EmailSenderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQJsonConsumer {
  private final EmailSenderService emailSenderService;

  @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
  public void sendEmail(Email email){
    emailSenderService.sendEmail("babinskaasia52@gmail.com", email.getTopic(), email.getMessage());
  }

}
