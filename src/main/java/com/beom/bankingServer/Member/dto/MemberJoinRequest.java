package com.beom.bankingServer.Member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


@Getter
@ToString
@NoArgsConstructor
public class MemberJoinRequest {


    @NotBlank(message = "빈 칸 금지")
    private String name;

    @NotBlank(message = "빈 칸 금지")
    private String password;

    @NotBlank(message = "빈 칸 금지")
    private String checkPassword;


    @Builder
    public MemberJoinRequest(String name, String password, String checkPassword) {
        this.name = name;
        this.password = password;
        this.checkPassword = checkPassword;
    }



}
