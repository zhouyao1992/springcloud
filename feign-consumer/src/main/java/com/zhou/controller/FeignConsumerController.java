package com.zhou.controller;

import com.zhou.service.FeignConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouyao on 2018/4/12.
 */
@RestController
public class FeignConsumerController
{
    @Autowired
    private FeignConsumerService feignConsumerService;

    /**
     * feign 无参调用方式
     * @return
     */
    @RequestMapping("/getFeignNoParam")
    public String getFeignNoParam(){

       return feignConsumerService.get();


   }


    /**
     * feign 有参调用方式
     * @return
     */
    @RequestMapping("/getFeignHaveParam/{name}")
    public String getFeignHaveParam(@PathVariable String name){

        return feignConsumerService.getParam(name);


    }


}
