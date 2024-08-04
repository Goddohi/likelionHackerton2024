package com.cl.youngri.Member;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {
    @NotEmpty(message = "사용자ID는 필수항목입니다.")
    private String memberId;
    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password;
}
