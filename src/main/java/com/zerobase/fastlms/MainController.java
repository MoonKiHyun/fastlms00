package com.zerobase.fastlms;

import com.zerobase.fastlms.components.MailComponents;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.PrintWriter;
@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;

    @RequestMapping("/")
    public String index() {
        /*
        String email = "ansrlgus2tp@naver.com";
        String subject = "안녕하세요. 제로베이스 입니다.";
        String text = "<p>안녕하세요</p><p>반갑습니다</p>";

        mailComponents.sendMail(email, subject, text);
        */
        return "index";
    }


}
