package com.zhou.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhouyao on 2018/4/12.
 */
@Service
public class RibbonConsumerService extends  BaseService
{
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "HystrixFallback")
    public String helloConsumer() {
        return restTemplate.getForObject("http://eureka-produce/get", String.class);
    }



}
