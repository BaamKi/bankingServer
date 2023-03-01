package com.beom.bankingServer.Member.controller;

import com.beom.bankingServer.Member.dto.MemberJoinRequest;
import com.beom.bankingServer.Member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/test")
    public String test()
    {
        return "test";
    }


    @PostMapping("/join")
    public String Join(@RequestBody @Valid MemberJoinRequest request)
    {
        log.info(request.toString());
       return memberService.join(request);
    }




}
