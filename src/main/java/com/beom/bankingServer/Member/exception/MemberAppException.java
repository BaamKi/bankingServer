package com.beom.bankingServer.Member.exception;



public abstract class MemberAppException extends RuntimeException{


    public MemberAppException(String message){
        super(message);
    }

    public MemberAppException(String message, Throwable cause)
    {
        super(message,cause);
    }

    public abstract int getStatusCode();




}
