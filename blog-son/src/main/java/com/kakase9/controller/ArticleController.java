package com.kakase9.controller;

import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.Article;
import com.kakase9.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yjt
 * @create 2022-09-10-17:08
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

//    @GetMapping("/list")
//    public List<Article> test(){
//       return articleService.list();
//    }

    /**
     * 热门文章列表
     * @return
     */
    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){
        //查询热门文章封装成ResponseResult 对象返回
        ResponseResult result=articleService.hotArticleList();
        return result;
    }


    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        System.out.println(pageNum+" "+pageSize+" 01");
        return articleService.articleList(pageNum,pageSize,categoryId);
    }

    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id")  Long id){
        return articleService.getArticleDetail(id);
    }

}
