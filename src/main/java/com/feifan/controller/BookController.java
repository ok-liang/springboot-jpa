package com.feifan.controller;

import com.feifan.entity.Book;
import com.feifan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@CrossOrigin//开启跨域穿透，即其他服务器可以直接访问
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/findAll")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/findOne/{id}")
    public Book findById(@PathVariable Integer id){
        return bookService.findById(id);
    }

    @GetMapping("/save")
    public Book save(){
        Book book = new Book(10002,"《人性的弱点》","没有细节","出版社");
        return bookService.save(book);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        bookService.deleteById(id);
        return "删除成功";
    }

    @GetMapping("/update")
    public Book update(Book book){
        Book update = bookService.update(book);
        return update;
    }
}
