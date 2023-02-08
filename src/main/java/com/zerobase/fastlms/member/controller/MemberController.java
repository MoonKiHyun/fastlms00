package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;
    /*
    public MemberController(MemberService memberService){  --> @RequiredArgsConstructor가 자동으로 만들어줌
        this.memberService = memberService;
    }
    */
    @GetMapping(value = "/member/register")
    public String register() {

        return "member/register";
    }

    //  request : WEB -> SERVER
    //  response : SERVER -> WEB
    @PostMapping("/member/register")
    public String registerSubmit(Model model, HttpServletRequest request, MemberInput parameter) {

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complete";
    }

    //  http://www.naver.com/news/list.do?id=1234&key=1234&text=쿼리
    //  프로토콜://도메인(IP).news/list.do?쿼리스트링(파라미터)

    @GetMapping("/member/email-auth")
    public String emailAuth(Model model, HttpServletRequest request) {
        String uuid = request.getParameter("id");
        System.out.println(uuid);

        boolean result = memberService.emailAuth(uuid);
        model.addAttribute("result", result) ;

        return "member/email-auth";
    }
    @GetMapping("/member/info")
    public String memberInfo() {

        return "member/info";
    }

}
