package com.sparta.sparta_week04_00.controller;


import com.sparta.sparta_week04_00.dto.MemberRequestDto;
import com.sparta.sparta_week04_00.model.BasicResponse;
import com.sparta.sparta_week04_00.repository.MemberRepository;
import com.sparta.sparta_week04_00.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberRepository memberRepository,
                            MemberService memberService){

        this.memberRepository = memberRepository;
        this.memberService = memberService;


    }

    // 회원가입 요청
//    @GetMapping("/member/register")
//    public ResponseEntity<BasicResponse> registerMembers(MemberRequestDto requestDto){
//
//            memberService.registerMembers(requestDto);
//
//
//    }




}
