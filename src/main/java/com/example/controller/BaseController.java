package com.example.controller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mapper.BizBaseMapper;
import com.example.service.AbsBaseService;
import com.example.service.IBaseService;

import javax.annotation.Resource;

public abstract class BaseController<T> {
    @Resource
    protected IBaseService<T> service;
}
