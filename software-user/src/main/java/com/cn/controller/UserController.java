package com.cn.controller;

import com.cn.feign.IUserClientService;
import com.cn.po.ProductPo;
import com.cn.po.UserInformation;
import com.cn.po.UserInformationAndToken;
import com.cn.req.ProductIdReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zwl
 * @date 2024年03月09日 16:28:09
 * @packageName com.cn.controller
 * @className UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	IUserClientService iUserClientService;


	@PostMapping("/getInfoById")
	public UserInformationAndToken get(@RequestBody ProductIdReq productIdReq) {
		return iUserClientService.get(productIdReq);
	}

	@PostMapping("/addInfo")
	public Object add(@RequestBody UserInformation userInformation) {
		return iUserClientService.add(userInformation);
	}

	@PostMapping("/getAllInfo")
	public Object list() {
		return iUserClientService.list();
	}
}
