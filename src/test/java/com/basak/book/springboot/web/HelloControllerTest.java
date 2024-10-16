package com.basak.book.springboot.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HelloController.class) // HelloController 테스트
public class HelloControllerTest {

    @Autowired // MockMvc 주입
    private MockMvc mvc;

    @Test
    public void helloReturns() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // 요청 수행
                .andExpect(status().isOk()) // 상태 코드 확인
                .andExpect(content().string(hello)); // 반환 값 확인
    }
}
