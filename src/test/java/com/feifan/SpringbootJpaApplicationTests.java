package com.feifan;

import com.feifan.dao.BookDAO;
import com.feifan.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaApplicationTests {

    @Autowired
    private BookDAO dao;

    @Test
    public void diyQuery() {
        Book b = dao.findByNameAndPublisher("《狼道》", "抖音出版社");
        System.out.println(b);
    }
}
