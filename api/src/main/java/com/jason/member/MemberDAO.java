package com.jason.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-21
 * @description :
 */

@Repository
public interface MemberDAO extends JpaRepository<Member, Long> {

}