package com.mtg.melted.controller;

import com.mtg.melted.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gtt on 2020/3/7.
 */
@RequestMapping("/consumer/dept")
@RestController
public class DeptController_Consumer {
//    private static String REST_URL_PREFIX = "http://localhost:8001";
    private static String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DeptClientService deptClientService;

    @RequestMapping("/selDept")
    public Object getDeptConsumer(){
        Object object = restTemplate.getForObject(REST_URL_PREFIX+"/dept/selDept",Object.class);

        return object;
    }
    @RequestMapping("/selDeptFeign")
    public Object getDeptConsumerFeign(){
        Object object  = deptClientService.selDept();

        return object;
    }


}
