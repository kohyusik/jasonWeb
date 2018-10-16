package com.jason.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public String index() {
    
        return "say hello";
    }
}