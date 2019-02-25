package com.bbsee.tec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/2/25 15:08
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonClientStarter {
    public static void main(String[] args){
        SpringApplication.run(RibbonClientStarter.class);
    }
}
