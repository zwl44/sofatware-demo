package com.cn.config;

import com.cn.enums.LimitsAuthorityEnum;
import com.cn.feign.IUerTokenClientService;
import com.cn.po.TokenInformation;
import com.cn.po.UserInformationAndToken;
import com.cn.req.ProductIdReq;
import com.cn.req.TokenReq;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * @author zwl
 * @date 2024年03月09日 19:48:21
 * @packageName com.cn.config
 * @className TokenInterceptor
 * 产品功能模块，token拦截校验
 */
public class TokenInterceptor implements HandlerInterceptor {

	private final IUerTokenClientService iUerTokenClientService;

	public TokenInterceptor(IUerTokenClientService iUerTokenClientService) {
		this.iUerTokenClientService = iUerTokenClientService;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		// 从header中获取token
		String token = request.getHeader("Authorization");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		System.out.println(token);
		// 判断token是否存在
		if (token == null) {
			return false;
		}
		//可以在这里添加token验证逻辑 这里使用用户id作为token获取用户信息和权限token,一般可以采用工号传递，权限绑定工号
		UserInformationAndToken o =  iUerTokenClientService.get(new ProductIdReq((long) Integer.parseInt(token)));

		if (o == null) {
			return false;
		}
		String limitsAuthority = o.getLimitsAuthority();
		String[] limitsAuthoritArray = limitsAuthority.split(",");
		//获取路径
		String requestURI = request.getRequestURI();
		int limitId = LimitsAuthorityEnum.getLimitId(requestURI);
		//判断该用户是否拥有该接口的权限，遍历其权限列表
		//测试demo 不做完善空指针校验 保证数据存在
		for (String s : limitsAuthoritArray) {
			if (s.equals(String.valueOf(limitId))) {
				response.setStatus(HttpServletResponse.SC_OK);
				return true;
			}
		}
		return false;
	}
}
