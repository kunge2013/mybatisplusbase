package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService extends AbsBaseService<User> implements IUserService {

    @Resource
    private UserMapper mapper;

    @Override
    public User sel(long id) {
        return mapper.sel(id);
    }
}
