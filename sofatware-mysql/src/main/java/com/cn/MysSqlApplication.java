package com.cn; /**
 * @author zwl
 * @date 2024年03月08日 22:16:30
 * @packageName PACKAGE_NAME
 * @className com.en.ProductApplication
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName com.en.ProductApplication
 * @Description 启动类
 * @Author liuxiaobai
 * @Date 2020年6月25日11:21:02
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("com.cn.mapper")
@EnableEurekaClient
public class MysSqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(MysSqlApplication.class,args);
	}
}