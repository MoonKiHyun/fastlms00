package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.entity.Member;
import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.repository.MemberRepository;
import com.zerobase.fastlms.member.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    //request : WEB -> SERVER
    //response : SERVER -> WEB
    @PostMapping("member/register")
    public String registerSubmit(Model model, HttpServletRequest request, MemberInput parameter) {

        boolean result = memberService.register(parameter);
        model.addAttribute("result", result);

        return "member/register_complete";
    }


}
