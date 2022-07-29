package com.sparta.sparta_week04_00.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberRequestDto {

    private String name;
    private String password;
    private String repassword;

}
