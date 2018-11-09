package com.jason.member.custom;

import com.jason.member.Member;
import org.springframework.stereotype.Repository;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-21
 * @description :
 */

public interface MemberCustomDAO {
    
    Member findCustom();
}