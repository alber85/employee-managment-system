package com.workmotion.employeemanagementsystem.base.exception.custom;

public class AuthorizationException extends RuntimeException{
    public AuthorizationException(String message) {
        super(message);
    }
}
