package com.cl.youngri.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    @Autowired
    MemberRepositroy memberRepositroy;

    public Member save(Member request){
        return memberRepositroy.save(request);
    }

    public Member create (Member member){

        return member;
    }
    }

