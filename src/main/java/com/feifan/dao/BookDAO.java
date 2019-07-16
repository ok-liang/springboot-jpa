package com.feifan.dao;

import com.feifan.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository<Book,Integer>
 *     Book：代表查询的结果用哪个类进行封装
 *     Integer：代表实体的主键。
 *
 * 此接口只需要继承 JpaRepository这个接口，即可以在Service层中调用此接口中定义的所有的CRUD方法。
 */
@Repository
public interface BookDAO extends JpaRepository<Book,Integer> {

    /**除了使用接口中的定义好的方法外，还可以自定义dao方法*/
    Book findByNameAndPublisher(String name1,String publisher);


}
