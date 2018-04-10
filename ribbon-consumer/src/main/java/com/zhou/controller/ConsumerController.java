package com.zhou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhouyao on 2018/4/9.
 */
@RestController
public class ConsumerController
{

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/ribbon")
    public String helloConsumer() {
        return restTemplate.getForObject("http://eureka-produce/get", String.class);
    }

}
