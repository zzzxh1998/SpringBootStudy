package com.xiaohu.crud_start.service;

import java.util.List;

public interface BaseService<T> {
    /**
     * 查询所有
     *
     * @return
     */
    List<T> findAll();

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    List<T> findById(Long id);

    /**
     * 添加
     *
     * @param t
     */
    void create(T t);

    /**
     * 删除（批量）
     *
     * @param ids
     */
    void delete(Long... ids);

    /**
     * 修改
     *
     * @param t
     */
    void update(T t);
}
