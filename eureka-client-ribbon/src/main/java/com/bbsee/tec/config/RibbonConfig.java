package com.bbsee.tec.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/2/25 17:34
 * @Description:
 */
@Configuration
public class RibbonConfig {
    /**
     * 将restTemplate注入IoC，加上LoadBalanced注解，Ribbon的负载均衡就开启了
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
