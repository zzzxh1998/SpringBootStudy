package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;
import org.springframework.stereotype.Service;


public interface IBookService extends IService<Book> {
    /*
    *
    * 如果项目需要写的功能是没有的，需要自己手动添加
    * */

    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getPage(int currentPage,int pageSize);


}
