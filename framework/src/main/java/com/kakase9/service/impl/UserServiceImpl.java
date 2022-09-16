package com.kakase9.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.User;
import com.kakase9.domain.vo.UserInfoVo;
import com.kakase9.mapper.UserMapper;
import com.kakase9.utils.BeanCopyUtils;
import com.kakase9.utils.SecurityUtils;
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


    @Override
    public ResponseResult userInfo() {
        //获取用户id
        Long userId = SecurityUtils.getUserId();
        //根据用户id查询用户信息
        User user = getById(userId);
        //封装成UserInfoVo
        UserInfoVo vo= BeanCopyUtils.copyBean(user,UserInfoVo.class);

        return ResponseResult.okResult(vo);
    }
}
