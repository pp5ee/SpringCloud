package com.bbsee.tec.service;

import com.bbsee.tec.response.RestResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/23 14:33
 * @Description:
 */
@Service
public class FileService {

    /**
     * 获取上传文件的信息
     * @param multipartFile
     * @return
     */
    public RestResponse getFileInfo(MultipartFile multipartFile){
        String fileName=multipartFile.getOriginalFilename();
        long size=multipartFile.getSize();
        return RestResponse.success("你上传的文件："+fileName+",文件大小是："+size+"Byte");
    }
}
