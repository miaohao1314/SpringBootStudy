package com.teach.wiki.controller;


import com.teach.wiki.domain.Ebook;
import com.teach.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/getEbookList")
    public List<Ebook> getEbookList(){
        return  ebookService.getEbook();
    }

}
