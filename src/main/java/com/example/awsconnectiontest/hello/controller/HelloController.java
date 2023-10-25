package com.example.awsconnectiontest.hello.controller;

import com.example.awsconnectiontest.hello.entity.Hello;
import com.example.awsconnectiontest.hello.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

  private final HelloRepository helloRepository;

  @GetMapping("/test")
  public String helloTest() {
    return "Hello AWS Update update update 4";
  }

  @GetMapping("/test/db")
  public String helloDbTest() {
    helloRepository.save(Hello.builder()
        .name("name1")
        .ban("1")
        .build());
    return "success";
  }

  @Value("${jwt.oauth}")
  private String pwd;
  @GetMapping("/yml")
  public String ymlTest() {
    pwd = "test success";

    return pwd;
  }
}

