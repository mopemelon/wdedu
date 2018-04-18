package com.wd.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

/**
 * Created by w.wolf on 2018/4/18.
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.wd.edu"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
