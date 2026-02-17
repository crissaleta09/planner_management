package com.plannermanagement.domain.exception;

public class ProductNotFoundException extends RuntimeException
{
    public ProductNotFoundException(String message)
    {
        super(String.format("Products not found in %s", message));
    }
}
