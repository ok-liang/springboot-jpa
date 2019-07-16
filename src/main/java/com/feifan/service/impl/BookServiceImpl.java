package com.feifan.service.impl;

import com.feifan.dao.BookDAO;
import com.feifan.entity.Book;
import com.feifan.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
//@Transactional//事务控制 全部方法都会事务处理
public class BookServiceImpl implements BookService {

    @Resource
    private BookDAO dao;

    @Override
    public List<Book> findAll(){
        List<Book> all1 = dao.findAll();
        return all1;
    }

    @Override
    public Book findById(Integer id) {
        Optional<Book> byId = dao.findById(id);

        if(byId.isPresent()){
            return byId.get();
        }else {
            return null;
        }
    }

    @Override
    public Book save(Book book) {
        Book save = dao.save(book);
        return save;
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Book update(Book book) {
        Book save = dao.save(book);
        return save;
    }
}
