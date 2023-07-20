package com.babinska.emailsender.email;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
public class Email {
  @Id
  private Long id;
  //@ManyToOne
//  private Long studentId;
  private String topic;
  private String message;
//  private LessonReservation lessonReservation;
//  private LocalDateTime messageTime;
}