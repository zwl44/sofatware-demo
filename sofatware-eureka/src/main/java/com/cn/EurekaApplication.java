package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zwl
 * @date 2024年03月08日 23:43:46
 * @packageName com.en.config
 * @className EurekaApplication
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class,args);
	}
}
