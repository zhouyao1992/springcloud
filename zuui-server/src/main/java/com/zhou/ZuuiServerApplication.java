package com.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy        //开启Zuul的API网关服务
@EnableDiscoveryClient
@SpringBootApplication
public class ZuuiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuuiServerApplication.class, args);
	}
}
