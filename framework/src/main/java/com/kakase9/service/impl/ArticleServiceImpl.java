package com.kakase9.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.domain.entity.Article;
import com.kakase9.mapper.ArticleMapper;
import com.kakase9.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author yjt
 * @create 2022-09-10-17:05
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {


}
