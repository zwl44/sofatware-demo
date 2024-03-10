package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zwl
 * @date 2024年03月08日 22:46:19na
 * @packageName com.en
 * @className ConsumerApplication
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ProductApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class,args);
	}
}
