package com.beom.bankingServer.Member.vo;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String password;


    @Builder
    public Member(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
