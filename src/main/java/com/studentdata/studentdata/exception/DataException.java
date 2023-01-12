package com.studentdata.studentdata.exception;

public class DataException extends RuntimeException{
    public enum ExceptionType{
        DATA_DOES_NOT_EXIT , DATA_ALREADY_PRESENT
    }

    public ExceptionType exceptiontype;
    public String message;

    public DataException(String message, ExceptionType exceptiontype){
        this.exceptiontype = exceptiontype;
        this.message = message;
    }
    
}
