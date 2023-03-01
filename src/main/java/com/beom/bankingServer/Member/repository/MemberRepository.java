package com.beom.bankingServer.Member.repository;

import com.beom.bankingServer.Member.vo.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
}
