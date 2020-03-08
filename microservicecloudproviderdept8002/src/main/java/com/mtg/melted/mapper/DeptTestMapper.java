package com.mtg.melted.mapper;

import com.mtg.melted.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * Created by gtt on 2020/3/7.
 */
@Mapper
public interface DeptTestMapper {

    List<Dept> selDept();

}
