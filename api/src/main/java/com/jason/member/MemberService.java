package com.jason.member;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MemberService {

    private MemberDAO dao;

    public MemberService(MemberDAO dao) {

        this.dao = dao;
    }

    public Member findById(Long id) {

        return dao.findById(id).get();
    }

    public List<Member> findAll() {

        return dao.findAll();
    }

    @PostConstruct
    public void initMembers() {
        // set members
        String[] memberNames = { "koh", "yu", "sik" };
        for (String username : memberNames) {
            Member user = new Member();
            user.setUsername(username);
            dao.save(user);
        }

    }
}
