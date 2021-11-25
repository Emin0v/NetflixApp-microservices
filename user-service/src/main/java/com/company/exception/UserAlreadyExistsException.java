package com.company.exception;

public class UserAlreadyExistsException extends RuntimeException{

    public static final String MESSAGE = "Customer with given userUuid [%s] is already registered";

    public UserAlreadyExistsException(String username){
        super(String.format(MESSAGE, username));
    }
}
