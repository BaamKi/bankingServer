package com.beom.bankingServer.Member.exception;


import com.beom.bankingServer.common.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class ExceptionController {


    @ExceptionHandler(CheckPasswordException.class)
    @ResponseBody
    public ErrorResponse checkPasswordException(CheckPasswordException e)
    {
        ErrorResponse errorResponse = ErrorResponse.builder()
        .resCode(ErrorCode.CHECK_PASSWORD.getResCode())
        .resMessage(ErrorCode.CHECK_PASSWORD.getResMessage())
        .build();
        return errorResponse;
    }


}
