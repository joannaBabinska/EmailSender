package com.babinska.emailsender.Student.dto;

import lombok.Builder;

@Builder
public record StudentBasicDto(
        String firstName,
        String lastName,
        String email) {
}
