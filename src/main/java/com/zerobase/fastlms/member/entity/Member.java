package com.zerobase.fastlms.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    private LocalDateTime emailAuthDt;
}
