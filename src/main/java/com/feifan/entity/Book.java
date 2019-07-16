package com.feifan.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
/**
 * 建立Book实体类
 */
@Entity //声明这个类对应了一个数据库表
@Table(name = "tb_jpa_books")
public class Book implements Serializable {
    /**
     * IDENTITY———— //让主键自增，跟数据库中的一样。(推荐使用)
     * AUTO——————重新创建一张表，用来保存 主键的next索引。
     */
    @GeneratedValue(strategy=GenerationType.IDENTITY) //让主键自增
    @Id
    private Integer id;

    @Column(length = 32)
    private String name;

    @Column(length = 32)
    private String publisher;

    @Column(length = 255)
    private String detail;

    public Book(Integer id, String name, String publisher, String detail) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.detail = detail;
    }
}
