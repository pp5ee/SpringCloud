package com.bbsee.tec.controller;

import com.bbsee.tec.service.VisitUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/2/25 17:44
 * @Description:
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonTestController {
    @Autowired
    private VisitUrlService visitUrlService;

    /**
     * 简单的基于ribbon的负载均衡,eureka中配置了两个eurekaclient 且有同一个接口/rest/restTemplate，ribbon会轮询两个实例的接口
     * @param url
     * @return
     */

    @RequestMapping("/visitUrl")
    public String vistUrlByTemplate(@RequestParam(value = "url")String url){
        return visitUrlService.visitUrl(url);
    }
}
