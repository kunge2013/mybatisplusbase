package com.example.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.BizBaseMapper;
import com.example.service.IBaseService;

public  abstract class BaseService<F extends BizBaseMapper<T>, T> extends ServiceImpl<F,T> implements IBaseService<T> {

}
