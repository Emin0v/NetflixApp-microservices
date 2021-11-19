package com.company.exception;

public abstract class NotFoundException extends RuntimeException{

    public NotFoundException(String message){
        super(message);
    }

    public NotFoundException(String message, Throwable throwable){
        super(message,throwable);
    }
}
