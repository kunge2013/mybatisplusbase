package com.example.service;

import com.example.entity.User;

public interface IUserService<T> extends IBaseService<T> {
    User sel(long id);
}
