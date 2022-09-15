package com.kakase9.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.domain.entity.User;
import com.kakase9.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.kakase9.service.UserService;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2022-09-15 16:28:57
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
