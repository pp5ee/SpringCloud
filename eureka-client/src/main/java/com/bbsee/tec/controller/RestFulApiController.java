package com.bbsee.tec.controller;

import com.bbsee.tec.response.RestResponse;
import com.bbsee.tec.service.CalculateService;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/23 14:23
 * @Description:
 */
@RestController
@RequestMapping("/rest")
@RestControllerAdvice
@Api(tags = "文件操作接口,主要用来演示swagger2如何上传文件")
public class RestFulApiController {
        @Autowired
        private CalculateService calculateService;

    /**
     *
     * @param index
     * @param str
     * @return
     */
    @ApiOperation(value = "批量上传接口",notes = "该接口用于批量上传文件")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "directory",value = "服务器文件夹路径",paramType = "form",dataType ="string"),
            @ApiImplicitParam(name = "remoteUri",value = "远端网络文件的地址",paramType = "form",dataType ="string" )})
    @RequestMapping(value = "/uploadByDirectory",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse getCurrentTime(@RequestParam(value = "index",defaultValue = "0")Integer index,
                                       @RequestParam(value = "str",defaultValue = "")String str){
        return calculateService.getCharByIndex(str,index);
    }

    /**
     * RestTemplate测试
     * RestTemplate是Spring Resource中的一个访问第三方RESTFul API的网络请求框架
     * @param url
     * @return
     */
    @RequestMapping(value = "/restTemplate",method = {RequestMethod.GET,RequestMethod.POST},headers = {})
    public String getResponseViTemplate(@ApiParam(name = "网站域名")@RequestParam("remoteUrl")String url){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(url,String.class);
    }


}
