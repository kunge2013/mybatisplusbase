package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.controller.PageFilter;
import com.example.entity.User;

public interface IUserService<T> extends IBaseService<T> {

    User sel(long id);

}
