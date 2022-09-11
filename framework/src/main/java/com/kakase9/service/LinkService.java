package com.kakase9.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2022-09-11 15:36:23
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
