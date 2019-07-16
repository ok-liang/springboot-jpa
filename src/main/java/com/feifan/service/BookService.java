package com.feifan.service;

import com.feifan.entity.Book;

import java.util.List;

public interface BookService {

    /**
     * 获取所有book
     * @return
     */
    List<Book> findAll();

    /**
     * 根据Id获取Book
     */
    Book findById(Integer id);

    /**
     * 保存一个Book
     * @return
     */
    Book save(Book book);

    /**
     * 删除一个Book
     * @param id
     */
    void deleteById(Integer id);

    Book update(Book book);
}
