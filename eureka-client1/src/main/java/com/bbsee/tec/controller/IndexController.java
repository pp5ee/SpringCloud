package com.bbsee.tec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/23 14:25
 * @Description:
 */
@Controller
@ApiIgnore
public class IndexController extends BaseController{
    @RequestMapping("/")
    public void welcome(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}
