package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zwl
 * @date 2024年03月09日 17:23:12
 * @packageName com.cn.config
 * @className SoftwareMainAppliction
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SoftwareMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(SoftwareMainApplication.class, args);
	}

}
