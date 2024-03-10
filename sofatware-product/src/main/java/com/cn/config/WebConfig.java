package com.cn.config;

import com.cn.feign.IUerTokenClientService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author zwl
 * @date 2024年03月09日 19:47:36
 * @packageName com.cn.config
 * @className WebConfig
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Resource
	private IUerTokenClientService iUerTokenClientService;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TokenInterceptor(iUerTokenClientService))
				// 拦截所有路径
				.addPathPatterns("/**")
				// 排除登录和错误处理路径
				.excludePathPatterns("/login", "/error");
	}
}
