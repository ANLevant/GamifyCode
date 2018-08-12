package com.gamifycode.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.gamifycode.persistence.model")
@EnableJpaRepositories(basePackages = "com.gamifycode.persistence.repository")
@ComponentScan(basePackages = "com.gamifycode")
public class GamifyCodeSpringApplication {

   public static void main(String[] args) {
      SpringApplication.run(GamifyCodeSpringApplication.class, args);
   }

}