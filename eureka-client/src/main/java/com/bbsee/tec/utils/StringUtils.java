package com.bbsee.tec.utils;



/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/23 15:26
 * @Description:
 */
public class StringUtils {

    public static String getCharByIndex(String string,int index){
        index=index-1;
        if (index>=string.length()||index<0){
            return "";
        }else {
            return string.charAt(index)+"";
        }
    }
}
