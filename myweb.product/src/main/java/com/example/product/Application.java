package com.example.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置myBatis-plus
 * 使用註解@MapperScan指向MyBatis實體類的package
 */
@SpringBootApplication
@MapperScan("com/example/product/dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
