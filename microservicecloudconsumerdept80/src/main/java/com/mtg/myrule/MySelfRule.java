package com.mtg.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gtt on 2020/3/8.
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule  myRule(){
        return new RandomRule_Self();
    }
}
