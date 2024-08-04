package com.cl.youngri.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    /*
    Save 메소드
    if(entityInformation.isNew(entity)){
    	em.persist(entity);
        return entity;
    }else{
    return em.merge(entity);
	}
}
     */

    public Member save(Member request) {
        return memberRepository.save(request);
    }

    /*
        public Member create (Member member){
            return member;
        }
    */
    public Member save(MemberForm request) {
        if (memberRepository.findByMemberId(request.getMemberId()).isEmpty()) {
            Member member = Member.builder()
                    .memberId(request.getMemberId())
                    .username(request.getUsername())
                    .password(request.getPassword())
                    .phonenum(request.getPhonenum()).build();
            return memberRepository.save(member);
        }
        return null;
    }


    public Optional<Member> findMemberByMemberId(String memberid) {
        return memberRepository.findByMemberId(memberid);
    }
    /*
        Choi  오류해결 힘들어하셔서 급히 추가해드렸습니다
        +)지금보니까 로그인 로직에 사용하시는 거네요 수정및 수정해드리겠습니다.
     */
    public Member findMemberByLoginLogic(String memberid, String password) {
        Optional<Member> member = memberRepository.findByMemberIdAndPassword(memberid,password);
        return member.orElse(null);
    }
}