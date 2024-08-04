package com.cl.youngri.Controller;

import com.cl.youngri.Member.LoginForm;
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

public class MemberController {

    MemberService memberService;


    /**
     * 작성일 : 08.03.2024
     * 작성자 choi
     * 작성함수  signupForm
     */
    @GetMapping("signup/")
    public String signupForm(Model model) {
        model.addAttribute("MemberForm", new MemberForm());
        return "member/signup";
    }

    /**
     * 작성일 : 08.03.2024
     * 작성자 choi
     * 작성함수  signup
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

    @PostMapping("/login/")
    public String loginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "member/login";
    }
    ////
    //  choi 코멘트: 최대한 작성하신 코드 안 건들였습니다
    //   디스코드에서 해당코드의 문제점 등을 설명드리겠습니다.
    //   완벽한 코드가 아니므로 수정및 보안해보셔도 좋습니다. (예외가 있을수도 있습니다.)
    ////
    public String login(@Valid LoginForm request, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "member/login";
        }

        Member member = memberService.findMemberByLoginLogic(request.getMemberId(),request.getPassword());
        //memberService.findMemberByStudenid(request.getPassword())) {
        if (memberService.findMemberByMemberId(request.getMemberId()).isEmpty()) {
            String errortext = "아이디가 존재하지 않습니다.";
            model.addAttribute("errortext", errortext);
            return "member/login";
        } else if (member==null) {// 08.05 2024 choi 사용하고 있으신 null 사용할수있도록  findMemberBy 만들어 드렸습니다.
            String errortext = "비밀번호가 잘못되엇습니다.";
            model.addAttribute("errortext", errortext);
        }
        return "redirect:/";
    }
}