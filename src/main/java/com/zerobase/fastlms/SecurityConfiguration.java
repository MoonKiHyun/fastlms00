package com.zerobase.fastlms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests().
                requestMatchers(
                "/"
                        , "/member/register"
                        ,"member/email-auth"
                )
                .permitAll();

        http.formLogin()
                .loginPage("/member/login")
                .failureHandler(null)
                .permitAll();

        return http.build();
    }
}
