package com.kakase9.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.Article;

/**
 * @author yjt
 * @create 2022-09-10-17:04
 */
public interface ArticleService extends IService<Article> {

    //查询热门文章
    ResponseResult hotArticleList();

    //文章列表
    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    //根据id查询文章
    ResponseResult getArticleDetail(Long id);
}
