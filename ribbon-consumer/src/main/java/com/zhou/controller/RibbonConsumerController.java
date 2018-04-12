package com.zhou.controller;

import com.zhou.service.RibbonConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon消费者
 * Created by zhouyao on 2018/4/9.
 */
@RestController
public class RibbonConsumerController
{

    @Autowired
    RibbonConsumerService ribbonConsumerService;
    @RequestMapping("/ribbon")
    public String helloConsumer() {
        return ribbonConsumerService.helloConsumer();
    }


   /*
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/ribbon")
    public String helloConsumer() {
        return restTemplate.getForObject("http://eureka-produce/get", String.class);
    }*/

}
