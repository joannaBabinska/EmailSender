package com.babinska.emailsender.mq;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ClientMq {
  private final RabbitTemplate rabbitTemplate;

  @GetMapping("/receiveMessage")
  public String get() {
    return rabbitTemplate.receive("email").toString();
  }

}