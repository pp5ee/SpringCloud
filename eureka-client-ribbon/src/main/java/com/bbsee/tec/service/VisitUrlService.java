package com.bbsee.tec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/2/25 17:38
 * @Description:正确的service 应当是接口，再被实现，这里作者精力有限就不那样写了
 */
@Service
public class VisitUrlService {
    /**
     * RESTTEMPLATE 用于消费REST APIS,支持 head、get、post、put、delete、options等方法
     * 分别对应：headeForHeaders()/getForObjects()/postForObject()/put()/delete()
     */
    @Autowired
    RestTemplate restTemplate;

    public String visitUrl(String url){
        String clientUrl="http://eurekaclient/rest/restTemplate?url=";
        return restTemplate.getForObject(clientUrl+url,String.class);
    }
}
