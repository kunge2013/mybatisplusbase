package com.example.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.service.IBaseService;

public  abstract class BaseService<F extends BaseMapper<T>, T> extends ServiceImpl<F,T> implements IBaseService<T> {

}
