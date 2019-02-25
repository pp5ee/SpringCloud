package com.bbsee.tec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/2/25 11:01
 * @Description:
 */
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class Client2Starter {
   public static  void main(String[] args){
       SpringApplication.run(Client2Starter.class,args);
   }
}
