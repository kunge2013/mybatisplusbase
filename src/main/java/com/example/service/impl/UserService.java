package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserService extends BaseService<UserMapper, User> implements IUserService<User> {

    @Resource
    UserMapper userMapper;

    @Override
    public User sel(long id) {
        return userMapper.sel(id);
    }


}
