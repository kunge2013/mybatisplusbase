package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.User;

public interface UserMapper extends BaseMapper<User> {
    /**
     * 自定义查询
     * @param id 主键
     * @return obj
     */
    public User sel(long id);
}
