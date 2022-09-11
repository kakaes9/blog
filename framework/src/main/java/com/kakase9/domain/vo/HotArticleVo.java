package com.kakase9.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yjt
 * @create 2022-09-10-21:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticleVo {
    private long id;
    //标题
    private String title;

    //访问量
    private Long viewCount;

}
