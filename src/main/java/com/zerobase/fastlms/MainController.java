package com.zerobase.fastlms;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    //request : WEB -> SERVER
    //response : SERVER -> WEB

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter printWriter = response.getWriter();

        String msg = "<html>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "</head>" +
                "<body>" +
                "<p>Hello</p>" +
                "<p>fastlms website</p>" +
                "<p>수정</p>" +
                "</body>" +
                "</html>";

        printWriter.write(msg);
        printWriter.close();

        return msg;
    }

}