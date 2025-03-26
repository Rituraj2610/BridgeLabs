package org.rituraj.exceptions.customexception;

public class InvalidAgeException extends Exception{
    private String message;

    public InvalidAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
