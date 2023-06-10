package com.teach.wiki.service;

import com.teach.wiki.Req.EbookReq;
import com.teach.wiki.Resp.EbookResp;
import com.teach.wiki.domain.Ebook;
import com.teach.wiki.domain.EbookExample;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private com.teach.wiki.Mapper.EbookMapper ebookMapper;

    public List<EbookResp> getEbook(EbookReq ebookReq){
        // select * from ebook where name like '%zhangsan%';
        EbookExample example = new EbookExample();
        EbookExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike('%'+ebookReq.getName()+'%');
        List<Ebook> ebooks = ebookMapper.selectByExample(example);

        List<EbookResp> list =new ArrayList<>();
        for (Ebook ebook : ebooks) {
            EbookResp ebookResp = new EbookResp();
//            ebookResp.setId(ebook.getId());
//            ebookResp.setName(ebook.getName());
            BeanUtils.copyProperties(ebook,ebookResp);
            list.add(ebookResp);
        }
        return list;
    }
}
