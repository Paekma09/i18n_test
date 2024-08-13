package com.example.i18n_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.i18n_test.mapper")
public class I18nTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(I18nTestApplication.class, args);
    }

}
