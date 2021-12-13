package com.pure.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zmy
 * @version V1.0
 * @since 2021-12-09 11:16:00
 */
@SpringBootApplication
@MapperScan("com.pure.**.dao")
@ComponentScan(basePackages = { "com.pure.**"})
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class);
    }
}
