package com.beom.bankingServer.Member.service;


import com.beom.bankingServer.Member.dto.MemberJoinRequest;
import com.beom.bankingServer.Member.exception.CheckPasswordException;
import com.beom.bankingServer.Member.repository.MemberRepository;
import com.beom.bankingServer.Member.vo.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {


    private final MemberRepository memberRepository;



    public String join(MemberJoinRequest reqeust) {

        if (! reqeust.getPassword().equals(reqeust.getCheckPassword()))
        {
            throw new CheckPasswordException();
        }else {
            Member member = Member.builder()
                            .name(reqeust.getName())
                            .password(reqeust.getPassword())
                            .build();
            memberRepository.save(member);
            return String.format("%s 회원가입 성공",reqeust.getName());
        }







    }





}
