package com.babinska.emailsender.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student{
  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
}
