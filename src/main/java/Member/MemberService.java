package Member;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Member;

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

