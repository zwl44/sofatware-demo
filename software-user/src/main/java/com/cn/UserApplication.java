package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zwl
 * @date 2024年03月09日 16:24:57
 * @packageName com.cn
 * @className UserApplication
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class,args);
	}

}
