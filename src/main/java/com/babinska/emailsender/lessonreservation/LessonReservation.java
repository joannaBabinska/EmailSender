package com.babinska.emailsender.lessonreservation;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LessonReservation {
  @Id
  private Long id;
  private String lessonType;
  private String topic;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private int durationInMinutes;
  private BigDecimal price;
}
