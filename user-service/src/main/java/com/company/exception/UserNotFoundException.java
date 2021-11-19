package com.company.exception;

public class UserNotFoundException extends NotFoundException{

    public static String MESSAGE = "User Not Found Exception";

    public UserNotFoundException(){
        super(MESSAGE);
    }

}
