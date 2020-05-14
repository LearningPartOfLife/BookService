package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication

@ComponentScans(value = { @ComponentScan(value = "com.example.*"), @ComponentScan(value = "com.csdn.ingo.entity") })
@MapperScan(basePackages = "com.csdn.ingo.dao")
public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

}
