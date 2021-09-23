package com.example.bookspringbootgraphql.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.bookspringbootgraphql.dto.BookDto;
import com.example.bookspringbootgraphql.entity.Book;
import com.example.bookspringbootgraphql.mapper.BookMapper;
import com.example.bookspringbootgraphql.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMutationResolver implements GraphQLMutationResolver {

    private final BookRepository bookRepository;

    public Book createBook(BookDto bookDto){
        return bookRepository.save(BookMapper.dtoToEntity(bookDto));
    }
}
