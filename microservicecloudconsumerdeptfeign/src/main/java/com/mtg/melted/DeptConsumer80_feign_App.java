package com.mtg.melted;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by gtt on 2020/3/7.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptConsumer80_feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_feign_App.class,args);
    }
}
