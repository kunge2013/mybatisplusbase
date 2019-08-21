package com.example.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public class PageFilter<T> extends Page<T> {

    private T condation;

    public T getCondation() {
        return condation;
    }

    public void setCondation(T condation) {
        this.condation = condation;
    }

}
