package com.kakase9.service;

import com.kakase9.domain.ResponseResult;
import com.kakase9.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}