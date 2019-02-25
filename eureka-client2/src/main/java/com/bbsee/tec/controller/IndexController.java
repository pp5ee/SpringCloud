package com.bbsee.tec.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/2/25 11:20
 * @Description:
 */
@Controller
@ApiIgnore
public class IndexController {

    @RequestMapping("/")
    public void welcome(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}
