package com.kakase9.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2022-09-15 16:28:55
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);
}
