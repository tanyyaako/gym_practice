package org.example.Exceptions;

public class EntityNotFoundExcep extends RuntimeException {
    public EntityNotFoundExcep(String message) {
        super(message);
    }
}
