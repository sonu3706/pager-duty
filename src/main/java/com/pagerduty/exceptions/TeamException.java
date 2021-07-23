package com.pagerduty.exceptions;

public class TeamException {
    public static  class TeamAlreadyExistException extends RuntimeException {
        public TeamAlreadyExistException(String message) {
            super(message);
        }
    }
}
