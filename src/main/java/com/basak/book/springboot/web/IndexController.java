package com.basak.book.springboot.web;

import com.basak.book.springboot.domain.posts.Posts;
import com.basak.book.springboot.web.dto.PostsListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import com.basak.book.springboot.service.posts.PostsService;
import com.basak.book.springboot.web.dto.PostsResponseDto;

@RequiredArgsConstructor
@Controller

public class IndexController {

    private final PostsService postsService;


    @GetMapping("/posts/save")
    public String postsSave() {
        return "Posts-save";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
