package com.beom.bankingServer.common;

import lombok.Getter;

@Getter
public enum ErrorCode {


    CHECK_PASSWORD(000,"비밀번호 확인이 잘못되었습니다.");


    private int resCode;

    private String resMessage;

    ErrorCode(int resCode, String resMessage) {
        this.resCode = resCode;
        this.resMessage = resMessage;
    }
}
