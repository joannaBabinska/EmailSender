package com.babinska.emailsender.mq;

import com.babinska.emailsender.Student.dto.StudentBasicDto;
import com.babinska.emailsender.Student.dto.StudentLessonReservationDto;
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
  public void sendWelcomeEmail(StudentBasicDto student){
    log.info("Send welcome email -> {}", student.toString());
    emailSenderService.sendEmail(DEV_EMAIL, "Welcome email", String.format("""
            Hello %s + %s!
            Welcome in Our School!
            """,student.firstName(), student.lastName()));
  }

  @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
  public void sendInformEmailLessonReservation(StudentLessonReservationDto studentLessonReservationDto){
    log.info("Send reservation information  -> {}", studentLessonReservationDto);
    emailSenderService.sendEmail(DEV_EMAIL, "You have new reservation", String.format("""
            Data rezerwacji : %s
            Imie : %s
            """,studentLessonReservationDto.reservationDate(), studentLessonReservationDto.student().firstName()));
  }

}
