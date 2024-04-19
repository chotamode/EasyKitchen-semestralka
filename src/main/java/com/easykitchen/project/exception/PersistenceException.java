package com.easykitchen.project.exception;

public class PersistenceException extends BaseException{
    public PersistenceException(String message, Throwable cause){
        super(message, cause);
    }

    public PersistenceException(Throwable cause) {
        super(cause);
    }
}
