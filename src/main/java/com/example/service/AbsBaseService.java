package com.example.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public  abstract class AbsBaseService<T> implements IBaseService {

    @Autowired
    protected BaseMapper<T> mapper;

    public void superMapper(BaseMapper<T> mapper) {
        this.mapper = mapper;
    }


    @Override
    public int insert(Object entity) {
        return mapper.insert((T)entity);
    }

    @Override
    public int deleteById(Serializable id) {
        return mapper.deleteById(id);
    }

    @Override
    public int deleteByMap(Map columnMap) {
        return mapper.deleteByMap(columnMap);
    }

    @Override
    public int updateById(Object entity) {
        return mapper.updateById((T)entity);
    }

    @Override
    public List selectByMap(Map columnMap) {
        return mapper.selectByMap(columnMap);
    }

}
