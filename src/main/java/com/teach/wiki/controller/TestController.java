package com.teach.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// ctrl+alt+o

@RestController
@RequestMapping("hello")
public class TestController {

    @RequestMapping("/first")
    public  String  hello(){
        return "这是我用idea进行的第一次提交";
    }
}
