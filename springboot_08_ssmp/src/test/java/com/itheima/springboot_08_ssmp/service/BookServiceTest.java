package com.itheima.springboot_08_ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import com.itheima.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService iBookService;

    @Test
    void testGetById(){
        System.out.println(iBookService.getById(5));
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("aaaa");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        iBookService.save(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(13);
        book.setType("11111");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        iBookService.updateById(book);
    }

    @Test
    void testDelect(){
        iBookService.removeById(12);
    }

    @Test
    void testGetAll(){
        iBookService.list();

    }

    @Test
    void testGetPage(){
        IPage<Book> page = new Page<Book>();
        iBookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());

    }

}
