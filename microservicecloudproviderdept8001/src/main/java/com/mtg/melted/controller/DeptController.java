package com.mtg.melted.controller;

import com.mtg.melted.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gtt on 2020/3/7.
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/selDept" ,method = RequestMethod.GET)
    public Object selDept(){
        Object res = deptService.selDept();
        return res;
    }

}
