package com.cl.youngri.Member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String memberId;

    @Column(unique = true, nullable = false)
    private String username;
    @Column (name = "member_PW")
    private String password;
    @Column (name = "member_PN")
    private String phonenum;
}

