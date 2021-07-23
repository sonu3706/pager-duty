package com.pagerduty.controller;

import com.pagerduty.exceptions.TeamException;
import com.pagerduty.models.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(TeamException.TeamAlreadyExistException.class)
    public ResponseEntity<?> handleTeamAlreadyExistsException(TeamException.TeamAlreadyExistException message, WebRequest webRequest) {
        ExceptionResponse exceptionResponse = createExceptionResponseObject(message.getMessage());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.CONFLICT);
    }

    public ExceptionResponse createExceptionResponseObject(String exceptionMessage) {
        return ExceptionResponse.builder().exceptionMessage(exceptionMessage).exceptionTime(LocalDateTime.now()).build();
    }
}
