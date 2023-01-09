package com.zerobase.fastlms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/member/register")
    public String register(){
        return "member/register";
    }
}
