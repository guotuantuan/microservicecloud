package com.mtg.melted;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by gtt on 2020/3/7.
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.mtg.melted.mapper")
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
