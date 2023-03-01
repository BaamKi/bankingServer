package com.beom.bankingServer.Member.exception;


import lombok.Builder;
import lombok.Getter;

@Getter
public class ErrorResponse {


    private int resCode;

    private String resMessage;

    @Builder
    public ErrorResponse(int resCode, String resMessage) {
        this.resCode = resCode;
        this.resMessage = resMessage;
    }




}
