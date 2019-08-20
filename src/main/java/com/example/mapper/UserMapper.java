package com.example.mapper;

import com.example.entity.User;

public interface UserMapper extends BizBaseMapper<User> {
    /**
     * 自定义查询
     * @param id 主键
     * @return obj
     */
    public User sel(long id);
}
