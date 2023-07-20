package com.babinska.emailsender.mq;

import com.babinska.emailsender.email.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQJsonConsumer {

  @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
  public void consumeJsonMessage(Email email){
    log.info(String.format("Receive JSON message -> %s", email.toString()));
  }
}
