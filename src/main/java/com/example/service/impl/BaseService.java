package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.controller.PageFilter;
import com.example.service.IBaseService;

public  abstract class BaseService<F extends BaseMapper<T>, T> extends ServiceImpl<F,T> implements IBaseService<T> {


    @Override
    public IPage<T> page(PageFilter<T> t) {
        return  page(t, pageWrapper(t));
    }
    /**
     * 重写自定义查询条件
     * @param t obj
     * @return wrapper
     */
    protected QueryWrapper<T> pageWrapper(PageFilter<T> t) {
        QueryWrapper<T> wrapper = new QueryWrapper<>();
        if (t.getCondation() == null) {
            return wrapper;
        }
        return wrapper.setEntity(t.getCondation());
    }
}
