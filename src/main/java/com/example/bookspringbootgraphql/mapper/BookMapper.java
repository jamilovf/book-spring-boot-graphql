package com.example.bookspringbootgraphql.mapper;

import com.example.bookspringbootgraphql.dto.BookDto;
import com.example.bookspringbootgraphql.entity.Book;

import java.util.Date;

public class BookMapper {

    public static Book dtoToEntity(BookDto bookDto){
        Book book = new Book();
        book.setBookName(bookDto.getBookName());
        book.setCategoryName(bookDto.getCategoryName());
        book.setAuthorName(bookDto.getAuthorName());
        book.setPublishDate(new Date());

        return book;
    }

    public static BookDto entityToDto(Book book){
        BookDto bookDto = new BookDto();

        bookDto.setBookName(book.getBookName());
        bookDto.setCategoryName(book.getCategoryName());
        bookDto.setAuthorName(book.getAuthorName());

        return bookDto;
    }
}
