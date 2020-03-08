package com.mtg.melted.service.impl;

import com.mtg.melted.entities.Dept;
import com.mtg.melted.mapper.DeptTestMapper;
import com.mtg.melted.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gtt on 2020/3/7.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptTestMapper deptTestMapper;

    @Override
    public List<Dept> selDept() {
        List<Dept> list = deptTestMapper.selDept();
        return list;
    }
}
