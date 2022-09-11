package com.kakase9.domain.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author yjt
 * @create 2022-09-11-15:47
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkVo {
    @TableId
    private Long id;


    private String name;

    private String logo;

    private String description;
    //网站地址
    private String address;

}
