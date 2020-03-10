package com.mtg.melted.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by gtt on 2020/3/9.
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Object selDept() {
                return "123";
            }
        };
    }
}
