package com.babinska.emailsender.Student;

import lombok.Builder;

@Builder
public record Student(
        String firstName,
        String lastName,
        String email) {
}

