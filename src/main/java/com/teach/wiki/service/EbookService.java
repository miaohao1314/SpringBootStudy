package com.teach.wiki.service;

import com.teach.wiki.domain.Ebook;
import com.teach.wiki.domain.EbookExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private com.teach.wiki.Mapper.EbookMapper ebookMapper;

    public List<Ebook> getEbook(){
        EbookExample example = new EbookExample();
        // select * from ebook
        List<Ebook> ebooks = ebookMapper.selectByExample(example);
        return ebooks;
    }
}
