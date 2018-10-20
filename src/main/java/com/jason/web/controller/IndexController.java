package com.jason.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : kohyusik
 * @version : 1.0
 * @date : 2018-10-16
 * @description :
 */
@Controller
@RequestMapping(path = "/")
public class IndexController {
    
    @GetMapping(path = { "/index", "/" })
    public String index() {
    
        return "layout/main_layout";
    }
    
    @GetMapping(path = { "/ping" })
    @ResponseBody
    public String ping() {
    
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss.SSS '('OOOO')'");
        // resolve conflict
        // fix bug(dev)

        return now.format(dateTimeFormatter);
    }
}