package com.zerobase.fastlms.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @GetMapping(value = "/member/register")
    public String register() {

        return "member/register";
    }

    //request : WEB -> SERVER
    //response : SERVER -> WEB
    @PostMapping("member/register")
    public String registerSubmit(HttpServletRequest request, HttpServletResponse response, MemberInput parameter) {

        System.out.println(parameter.toString());

        return "member/register";
    }


}
