package com.zerobase.fastlms.member.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class MemberInput {

    private String UserID;
    private String Name;
    private String Password;
    private String PhoneNumber;
}
