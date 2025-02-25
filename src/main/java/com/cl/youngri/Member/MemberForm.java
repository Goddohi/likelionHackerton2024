package com.cl.youngri.Member;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자ID는 필수항목입니다.")
    private String memberId;

    @NotEmpty(message = "이름은 필수항목입니다.")
    private String username;

    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password;

    @NotEmpty(message = "비밀번호 확인은 필수항목입니다.") // choi - 프론트에서 처리해도 괜찮지 않을까요?
    private String password2;

    @NotEmpty(message = "전화번호는 필수항목입니다.")
    private String phonenum;
}
