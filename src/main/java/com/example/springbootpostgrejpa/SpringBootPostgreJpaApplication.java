package com.example.springbootpostgrejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringBootPostgreJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPostgreJpaApplication.class, args);
    }

}
