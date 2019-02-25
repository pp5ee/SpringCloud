package com.bbsee.tec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/22 17:30
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class Client1Starter {
    public static void main(String[] args){
        SpringApplication.run(Client1Starter.class);
    }
}
