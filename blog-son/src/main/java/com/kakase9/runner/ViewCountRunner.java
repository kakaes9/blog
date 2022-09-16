package com.kakase9.runner;

import com.kakase9.domain.entity.Article;
import com.kakase9.mapper.ArticleMapper;
import com.kakase9.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author yjt
 * @create 2022-09-16-20:43
 */
@Component
public class ViewCountRunner implements CommandLineRunner {

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private RedisCache redisCache;

    @Override
    public void run(String... args) throws Exception {
        //查询博客信息  id  viewCount
        List<Article> articleList = articleMapper.selectList(null);
        Map<String, Integer> viewCountMap = articleList.stream()
                .collect(Collectors.toMap(article -> article.getId().toString(), article -> {
                    return article.getViewCount().intValue();
                }));

        //存储到redis中
        redisCache.setCacheMap("article:viewCount",viewCountMap);
    }
}
