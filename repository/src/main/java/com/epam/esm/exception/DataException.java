package com.epam.esm.exception;

public class DataException extends RuntimeException{

    public DataException(String message, Throwable cause) {
        super(message, cause);
    }
}
