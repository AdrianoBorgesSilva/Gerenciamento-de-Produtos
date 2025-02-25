package com.example.product_manager.exception;

public class ObjectNotFoundException extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
