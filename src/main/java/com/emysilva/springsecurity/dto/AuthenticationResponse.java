package com.emysilva.springsecurity.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    private final String jwt;
}
