package com.jason.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-16
 * @description :
 */
@Controller
public class IndexController {

    @GetMapping(path = { "/ajax" })
    @ResponseBody
    public List<String> ajaxTest(ArrayList<String> list) {
    
        System.out.println(list);
        return list;
    }

    @GetMapping(path = { "/ping" })
    @ResponseBody
    public String ping() {
    
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss.SSS '('OOOO')'");

        return now.format(dateTimeFormatter);
    }
}