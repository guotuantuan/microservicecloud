package com.mtg.melted;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by gtt on 2020/3/10.
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    public String applicationName;

    @RequestMapping(value = "/config",method = RequestMethod.GET)
    public Object getConfig(){
        return applicationName;
    }
}
