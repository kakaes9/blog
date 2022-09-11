package com.kakase9.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2022-09-10 22:08:03
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
