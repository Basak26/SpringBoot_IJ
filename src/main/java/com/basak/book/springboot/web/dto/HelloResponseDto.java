package com.basak.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Getter // 1
@RequiredArgsConstructor // 2

public class HelloResponseDto {
    private final String name;
    private final int amount;
}
