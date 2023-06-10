package com.teach.wiki.service;


import com.teach.wiki.domain.Test;
import com.teach.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper  testMapper;

    public List<Test>  getList(){
        List<Test> list = testMapper.list();
        return list;
    }
}
