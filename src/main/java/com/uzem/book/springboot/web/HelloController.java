package com.uzem.book.springboot.web;

import com.uzem.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amoount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
