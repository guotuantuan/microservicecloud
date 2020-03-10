package com.mtg.melted.controller;

import com.mtg.melted.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by gtt on 2020/3/7.
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping(value = "/selDept" ,method = RequestMethod.GET)
    public Object selDept(){
        Random random = new Random();
        int type = random.nextInt(2);
        if(type==1){
            throw new RuntimeException();
        }
        Object res = deptService.selDept();
        return res;
    }
    @RequestMapping
    public Object processHystrix_Get(){
//        Object res = deptService.selDept();
        Map<String,Object> map = new HashMap();
        map.put("name","rest error");

        return map;
    }

}
