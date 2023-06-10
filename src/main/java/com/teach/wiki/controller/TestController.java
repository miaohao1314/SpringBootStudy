package com.teach.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// ctrl+alt+o

@RestController
@RequestMapping("hello")
public class TestController {

    // restful风格
//    @RequestMapping(path="/first",method = RequestMethod.POST)
    @PostMapping("/first")
    public  String  hello(){
        return "这是我用idea进行的第一次提交";
    }

}
