package com.example.bookspringbootgraphql.repository;

import com.example.bookspringbootgraphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> getByCategoryName(String category);
}
