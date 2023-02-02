package com.zerobase.fastlms.components;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class MailComponents {

    private final JavaMailSender javaMailSender;

    public void sendMailTest() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("ansrlgus2tp@naver.com");
        msg.setSubject("제로베이스 입니다.");
        msg.setText("안녕하세요. 테스트 메일 입니다.");

        javaMailSender.send(msg);
    }

    public boolean sendMail(String mail, String subject, String text) {

        boolean result = false;

        MimeMessagePreparator mimeMessagePreparator = new MimeMessagePreparator() {
            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
                mimeMessageHelper.setTo(mail);
                mimeMessageHelper.setSubject(subject);
                mimeMessageHelper.setText(text, true);
            }
        };

        try {
            javaMailSender.send(mimeMessagePreparator);
            result = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;

    }
}