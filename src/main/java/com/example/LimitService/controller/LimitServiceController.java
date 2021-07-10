package com.example.LimitService.controller;

import com.example.LimitService.model.Configuration;
import com.example.LimitService.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
public LimitConfiguration retriveConfig(){
    return  new LimitConfiguration(configuration.getMax(),configuration.getMin());
}

}
