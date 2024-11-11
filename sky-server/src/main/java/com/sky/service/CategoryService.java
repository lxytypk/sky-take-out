package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.result.PageResult;

public interface CategoryService {
    /*新增分类*/
    void save(CategoryDTO categoryDTO);

    /*分页查询*/
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    /*分页查询*/
    /*根据id删除分类*/
    /*修改分类*/
    /*启用、禁用分类*/
    /*根据类型查询分类*/
}
