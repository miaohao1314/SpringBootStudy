package com.teach.wiki.controller;

import com.teach.wiki.domain.Test;
import com.teach.wiki.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

// ctrl+alt+o

@RestController
@RequestMapping("hello")
public class TestController {


    @Resource
   private   TestService testService;

    // restful风格
//    @RequestMapping(path="/first",method = RequestMethod.POST)
    @PostMapping("/first")
    public  String  hello(){
        return "这是我用idea进行的第一次提交";
    }

    @GetMapping("/list")
    public List<Test> getList(){
        List<Test> list = testService.getList();
        return list;
    }
}
