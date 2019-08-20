package com.example.controller;

import com.example.service.IBaseService;

import javax.annotation.Resource;

public abstract class BaseController<T> {
    @Resource
    protected IBaseService<T> service;
}
