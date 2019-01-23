package com.bbsee.tec.service;

import com.bbsee.tec.response.RestResponse;
import com.bbsee.tec.utils.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/23 15:22
 * @Description:
 */
@Service
public class CalculateService {

    public RestResponse getCharByIndex(String string,int index){
        String s1=StringUtils.getCharByIndex(string,index);
        if (s1.isEmpty()){
            return RestResponse.failure("无效的参数");
        }
        return  RestResponse.success("",s1);
    }

}
