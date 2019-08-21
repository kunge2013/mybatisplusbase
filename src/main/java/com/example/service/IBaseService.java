package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.controller.PageFilter;

public interface IBaseService<T> extends IService<T> {
    default IPage<T> page(PageFilter<T> t) {
        return null;
    }

}
