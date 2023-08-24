package com.babinska.emailsender.lessonreservation;

import com.babinska.emailsender.Student.Student;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

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
  @ManyToMany(cascade = {CascadeType.PERSIST,
          CascadeType.MERGE,
          CascadeType.REFRESH,
          CascadeType.DETACH})
  private Set<Student> students;
  private String topic;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private int durationInMinutes;
  private BigDecimal price;
}
