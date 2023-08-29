package com.babinska.emailsender.Student.dto;

import java.math.BigDecimal;

public record StudentLessonReservationDto(Long id,
                                          String lessonType,
                                          String topic,
                                          StudentBasicDto student,
                                          String startTime,
                                          String endTime,
                                          String reservationDate,
                                          int durationInMinutes,
                                          BigDecimal price) {
}
