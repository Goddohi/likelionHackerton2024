package com.cl.youngri.Member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberId(String memberid);
    Optional<Member> findByMemberIdAndPassword(String memberid, String passward);
}

