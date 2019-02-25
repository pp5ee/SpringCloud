package com.bbsee.tec.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/2/25 17:30
 * @Description:
 */
@RestController
@RequestMapping("/rest")
public class RestFulApiController {
    /**
     *
     * @param url
     * @return
     */
    @RequestMapping(value = "/restTemplate",method = {RequestMethod.GET,RequestMethod.POST},headers = {})
    public String getResponseViTemplate(@ApiParam(name = "网站域名")@RequestParam("url")String url){
        return "消息来自与client2,参数："+url;
    }
}
