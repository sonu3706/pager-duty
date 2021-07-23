package com.pagerduty.models;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExceptionResponse {
    private String exceptionMessage;
    private LocalDateTime exceptionTime;
}
