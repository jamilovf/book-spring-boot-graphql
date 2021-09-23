package com.example.bookspringbootgraphql.dto;

import lombok.Data;

@Data
public class BookDto {
    private String bookName;
    private String categoryName;
    private String authorName;
}
