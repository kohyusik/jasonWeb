package com.jason.member;

import com.jason.member.custom.MemberCustomDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-21
 * @description :
 */

@Repository
public interface MemberDAO extends JpaRepository<Member, Long>, MemberCustomDAO {
    
}