
package com.bbsee.tec.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2018/12/27 16:31
 * @Description:
 */

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Value("${project.version}")
    private String projectVersion;
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.bbsee.tec.controller")).
                paths(PathSelectors.any()).build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().
                title("欢迎使用swagger").
                description("swagger的一个小测试").contact(new Contact("BBSee","","rolltion.zhang@foxmail.com")).version(projectVersion).build();
    }
}

