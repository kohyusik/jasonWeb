package com.jason.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-16
 * @description :
 */
@Controller
@RequestMapping(path = "/api")
public class MemberController {

    MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(path = { "/members" })
    @ResponseBody
    public List<Member> members() {

        return memberService.findAll();

    }


    @GetMapping(path = { "/member/{id}" })
    @ResponseBody
    public Member member(@PathVariable Long id) {

        return memberService.findById(id);

    }
}