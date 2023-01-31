package com.zerobase.fastlms.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Member {

    @Id
    private String user_Id;
    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;
    private boolean emailAuthYn;
    private String emailAuthKey;
}