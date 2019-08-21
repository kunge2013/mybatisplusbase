package com.example.controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ResponseBean;
import com.example.service.IBaseService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.Serializable;

public abstract class BaseController<T> {

    @Resource
    protected IBaseService<T> service;

    protected boolean before(T entity) {
        return true;
    }

    protected boolean after(T entity) {
        return true;
    }

    /**
     * 查询列表
     * @param entity
     * @param page
     * @return
     */
    @PostMapping(value = "/pageList")
    public ResponseBean<Page<T>> queryForPage(T entity, PageFilter<T> page) {
        before(entity);
        page.setCondation(entity);
        Page<T> pageInfo = (Page<T>) service.page(page);
        after(entity);
        return ResponseBean.build(pageInfo, ResponseBean.SUCCESS) ;
    }

    /**
     * 保存单个
     * @param entity
     * @return
     */
    @PostMapping(value = "/save")
    public  ResponseBean<Boolean> save(T entity) {
        before(entity);
        boolean result = service.saveOrUpdate(entity);
        after(entity);
        return  ResponseBean.build(result, ResponseBean.SUCCESS);
    }
    /**
     * 删除单个
     * @param id
     * @return
     */
    @DeleteMapping(value = "/remove/{id}")
    public  ResponseBean<Boolean> remove(@PathVariable("id") Long id) {
        return  ResponseBean.build(service.removeById(id), ResponseBean.SUCCESS);
    }

    /**
     * 编辑单个
     * @param id
     * @return
     */
    @PutMapping(value = "/edit/{id}")
    public  ResponseBean<T> edit(@PathVariable("id") Serializable id) {
        return  ResponseBean.build(service.getById(id), ResponseBean.SUCCESS);
    }

}
