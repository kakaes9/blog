package com.kakase9.controller;

import com.kakase9.domain.ResponseResult;
import com.kakase9.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yjt
 * @create 2022-09-10-22:36
 */

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 分类列表
     * @return
     */
    @GetMapping("/getCategoryList")
    public ResponseResult getCategoryList(){

        return categoryService.getCategoryList();
    }

}
