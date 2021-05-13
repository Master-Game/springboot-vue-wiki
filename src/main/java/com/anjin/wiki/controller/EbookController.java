package com.anjin.wiki.controller;

import com.anjin.wiki.req.EbookReq;
import com.anjin.wiki.resp.CommonResp;
import com.anjin.wiki.resp.EbookResp;
import com.anjin.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * controller层不要见到 Ebook
 * 要 EbookReq,EbookResp
 */

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;
    
    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

}
