package com.sangng.springbootbootstrap.exception;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException(String message, Throwable cause){
        super(message, cause);
    }

    public BookIdMismatchException(){
        super();
    }

    public BookIdMismatchException(final String message){
        super(message);
    }

    public BookIdMismatchException(final Throwable cause){
        super(cause);
    }
}
