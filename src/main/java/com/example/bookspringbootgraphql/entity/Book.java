package com.example.bookspringbootgraphql.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book")
@Data
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, name = "book_name")
    private String bookName;

    @Column(length = 50, name = "category_name")
    private String categoryName;

    @Column(length = 50, name = "author_name")
    private String authorName;

    @Column(length = 50, name = "publish_date")
    private Date publishDate;
}
