package com.example.bookspringbootgraphql.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.bookspringbootgraphql.entity.Book;
import com.example.bookspringbootgraphql.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BookQueryResolver implements GraphQLQueryResolver {

    private final BookRepository bookRepository;

    public List<Book> getBooks(String category){
        return bookRepository.getByCategoryName(category);
    }

    public Optional<Book> getById(Long id){
        return bookRepository.findById(id);
    }
}
