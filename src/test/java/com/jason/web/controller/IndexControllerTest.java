package com.jason.web.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static junit.framework.TestCase.assertEquals;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-16
 * @description :
 */
public class IndexControllerTest {
    
    Logger log = LoggerFactory.getLogger(getClass());
    
    @Test
    public void pingTest() {
    
        ZonedDateTime now = ZonedDateTime.of(
                2018, 10, 16, 15, 7, 6, 169 * 1000000,
                ZoneId.of("Asia/Seoul"));
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss.SSS '('OOOO')'");
    
        String nowString = now.format(dateTimeFormatter);
        log.debug(nowString);
        
        assertEquals("10/16/2018 15:07:06.169 (GMT+09:00)", nowString);
    }
    
}
