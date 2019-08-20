package com.example.controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.ResponseBean;
import com.example.service.IBaseService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

public abstract class BaseController<T> {

    @Resource
    protected IBaseService<T> service;

    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    @ResponseBody
    public ResponseBean<Page<T>> queryForPage(Page page) {
        return ResponseBean.build((Page<T>) service.page(page),ResponseBean.SUCCESS) ;
    }

    /**
     * 保存单个
     * @param entity
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/save")
    public  ResponseBean<Boolean> save(@RequestBody T entity) {
        return  ResponseBean.build(service.save(entity), ResponseBean.SUCCESS);
    }
//
//    /**
//     * 批量保存
//     * @param entityList
//     * @return
//     */
//    @ResponseBody
//    @PostMapping(name="/saveBatch")
//    public ResponseBean<Boolean> saveBatch(Collection<T> entityList) {
//        return  ResponseBean.build(service.saveBatch(entityList), ResponseBean.SUCCESS);
//    }
//
//    /**
//     * 根据ID修改
//     * @param entity 对象
//     * @return boolean
//     */
//    @ResponseBody
//    @PostMapping(name="/updateById")
//    public ResponseBean<Boolean> updateById(T entity) {
//        return  ResponseBean.build(service.updateById(entity),ResponseBean.SUCCESS);
//    }
//
//    /**
//     * 根据ID删除
//     * @param id
//     * @return
//     */
//    @ResponseBody
//    @DeleteMapping(name = "removeById")
//    public ResponseBean<Boolean> removeById(Long id) {
//        return  ResponseBean.build(service.removeById(id), ResponseBean.SUCCESS);
//    }
}
