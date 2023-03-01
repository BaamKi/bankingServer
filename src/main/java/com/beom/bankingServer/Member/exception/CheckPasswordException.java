package com.beom.bankingServer.Member.exception;

import com.beom.bankingServer.common.ErrorCode;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class CheckPasswordException extends MemberAppException{

    public CheckPasswordException()
    {
        super(ErrorCode.CHECK_PASSWORD.getResMessage());
    }

    @Override
    public int getStatusCode()
    {
        return ErrorCode.CHECK_PASSWORD.getResCode();
    }


}
