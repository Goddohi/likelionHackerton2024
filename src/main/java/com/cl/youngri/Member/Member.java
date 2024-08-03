package com.cl.youngri.Member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor// Lombok을 사용한 자동 생성자 생성
public class Member {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)  //08-02-2024 Choi(-) : String으로 직접 id값 부여하기 때문에 지웠습니다.
    @Column(name = "member_id", unique = true, nullable = false)
    private String memberId;

    //@Column(unique = true, nullable = false)
    @Column(nullable = false)      //08-02-2024 Choi(-) :  사람이름 및 닉네임이 중복이 가능하도록 설정
    private String username;

    @Column (name = "member_PW")
    private String password;

    @Column (name = "member_PN")
    private String phonenum;
}

