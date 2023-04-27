package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 리다이렉션은 컨트롤러에서만 작동함. RestController에서는 작동하지 않음
@Controller
public class HttpRedirectionController {

    @GetMapping("/home")
    public String home() {
        // 1만 줄이 존재한다고 가정
        return "home";
    }

    @GetMapping("/away")
    public String away() {
        // 다른 코드들
        // 1만줄이 존재한다(존재해야 한다)고 가정
        return "redirect:/home"; // 리다이렉션이 동작함
    }
}
