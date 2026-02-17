package com.plannermanagement.domain.exception;

public class MappingNotSuccededException extends RuntimeException {
    public MappingNotSuccededException(String message) {
        super(String.format("Mapping not succeded in %s", message));
    }
}
