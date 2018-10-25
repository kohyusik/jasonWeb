package com.jason.web.member;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-21
 * @description :
 */

public class MemberTest {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Test
    public void saveTest() {

        int a = 10;
        int b = a;

        a = 4;

        System.out.println(a);
        System.out.println(b);

        Integer aa = 10;
        Integer bb = aa;

        aa = 4;

        System.out.println(aa);
        System.out.println(bb);

        Map map = new HashMap();
        Map map2 = new HashMap();

        map.put("test", "1" );
        map.put("test2", "1" );
        map.put("test3", "1" );
        map.put("test4", "1" );

        map.forEach((k, v) -> {
            map2.put(k, v);
            System.out.println(k);
        });




    }
}