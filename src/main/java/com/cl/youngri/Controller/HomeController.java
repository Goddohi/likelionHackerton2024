package com.cl.youngri.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j // Choi(+) 08.04.2024
public class HomeController {



    /**
     *  작성일 : 08.04.2024
     *  작성자 choi
     *  내용 홈으로 이동시 메인html으로 작동
     */
    @RequestMapping("/")
    public String home() {
        log.info("home");
        return "main";
    }

}
