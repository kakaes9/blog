package com.kakase9.controller;

import com.kakase9.domain.ResponseResult;
import com.kakase9.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author yjt
 * @create 2022-09-16-15:54
 */
@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;
    @PostMapping("/upload")
    public ResponseResult upload(MultipartFile img){
        return uploadService.uploadImg(img);
    }
}
