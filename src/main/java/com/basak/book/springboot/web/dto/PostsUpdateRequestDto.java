package com.basak.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class PostsUpdateRequestDto {

    private Long id;
    private String title;
    private String content;
    private String author;


}
