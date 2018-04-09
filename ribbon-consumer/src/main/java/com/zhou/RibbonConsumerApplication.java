package com.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 在应用类中通过@EnableDiscoveryClient
 * 注解让该应用注册为Eureka客户端应用，
 * 以获得服务发现的能力。同时在该主类中创建RestTemplate的Spring Bean实例，
 * 并通过@LoadBalanced注解开启客户端负载均衡。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication {
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}
}
