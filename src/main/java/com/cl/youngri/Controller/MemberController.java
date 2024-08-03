package com.cl.youngri.Controller;

import com.cl.youngri.Member.Member;
import com.cl.youngri.Member.MemberForm;
import com.cl.youngri.Member.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//@RestController   // Choi(-)JSON을 이용하려 헀지만 front 협의 이후 타임리프로 전환
@Controller         // 08.03.2024  Choi(+)JSON을 이용하려 헀지만 front 협의 이후 타임리프로 전환

@RequiredArgsConstructor // Lombok을 사용한 자동 생성자 생성
public class MemberController {

    private final MemberService memberService;


    /**
     *  작성일 : 08.03.2024
     *  작성차 choi
     *  작성함수  signupForm
     */
    @GetMapping("signup/")
    public String signupForm(Model model) {
        model.addAttribute("MemberForm", new MemberForm());
        return "member/signup";
    }

    /**
     *  작성일 : 08.03.2024
     *  작성차 choi
     *  작성함수  signup
     */

    @PostMapping("/signup/")
    public String signup(@Valid MemberForm request, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "member/signup"; // 유효성 검사 실패 시 다시 회원가입 폼으로 돌아감
        }

        Member member = memberService.save(request);
        if (member == null) {
            String errortext = "이미 있는 아이디입니다.";
            model.addAttribute("errortext", errortext);
            return "member/signup";
        }

        return "redirect:/"; // 회원가입 성공 시 리다이렉트
    }
}