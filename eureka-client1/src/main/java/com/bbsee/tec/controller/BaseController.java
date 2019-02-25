package com.bbsee.tec.controller;

import com.bbsee.tec.response.RestResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2018/12/25 15:27
 * @Description: 最外层的异常统一处理
 */

public class BaseController {
    @ExceptionHandler(Exception.class)
    public RestResponse handle(Exception e){
        e.printStackTrace();
        if (e instanceof SQLException) {
            return reply(e, "SQL异常：");
        }

        if (e instanceof IllegalArgumentException) {
            return reply(e, "非法参数：");
        }

        if (e instanceof IOException) {
            return reply(e, "IO异常：");
        }
        if(e instanceof NullPointerException){
            return reply(e,"空指针异常");
        }
        return reply(e,"");
    }
    private RestResponse reply(Exception e, String prefix) {
        return RestResponse.failure(prefix + e.getMessage());
    }
}
