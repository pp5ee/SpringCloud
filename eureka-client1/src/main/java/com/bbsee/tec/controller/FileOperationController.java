package com.bbsee.tec.controller;

import com.bbsee.tec.response.RestResponse;
import com.bbsee.tec.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/23 14:03
 * @Description:
 */
@RestController
@RequestMapping("/file")
@RestControllerAdvice
@Api(tags = "文件操作接口,主要用来演示swagger2如何上传文件")
public class FileOperationController extends BaseController{
    @Autowired
    private FileService fileService;

    @ApiOperation(value = "演示文件上传的接口",notes = "文件上传接口的提示信息",response = RestResponse.class)/**HttpMethod 会自动装配，**/
    @RequestMapping(value = "/upload",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public RestResponse upLoadFile(@ApiParam(name="file",value = "接口参数的说明,默认是空字符串",defaultValue = "提示用户参数的默认值",required = true/**是否必须，默认是false*/)
                                   @RequestParam(value = "file") MultipartFile multipartFile) throws Exception {
        if (multipartFile.isEmpty()) {
            return RestResponse.failure("无效的参数,请提交至少一个文件");
        }
        return fileService.getFileInfo(multipartFile);
    }
}
