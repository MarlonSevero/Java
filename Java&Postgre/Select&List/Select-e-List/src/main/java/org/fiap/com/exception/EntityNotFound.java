package org.fiap.com.exception;

public class EntityNotFound extends Exception {

    public EntityNotFound(){

    }

    public EntityNotFound(String message){
        super(message);
    }
}
