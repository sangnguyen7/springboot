package com.sangng.springbootbootstrap.exception;

import com.sangng.springbootbootstrap.model.Book;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public BookNotFoundException(){
        super();
    }

    public BookNotFoundException(final String message){
        super(message);
    }

    public BookNotFoundException(final Throwable cause){
        super(cause);
    }
}
