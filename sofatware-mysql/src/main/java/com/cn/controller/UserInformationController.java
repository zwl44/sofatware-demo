package com.cn.controller;


import com.cn.po.ProductPo;
import com.cn.po.UserInformation;
import com.cn.po.UserInformationAndToken;
import com.cn.req.ProductIdReq;
import com.cn.req.UserInformationRq;
import com.cn.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * controller
 *
 * @author tools.49db.cn
 * @version 1.0
 * @date 2024-03-09
 */
@RestController
@RequestMapping("/user")//todo 使用前请设置路径
@CrossOrigin(origins = "*")
public class UserInformationController {
	@Autowired
	private UserInformationService userInformationService;

	@PostMapping("/getInfoById")
	public UserInformationAndToken get(@RequestBody ProductIdReq productIdReq) {
		return userInformationService.selectById(productIdReq.getId());
	}

	@PostMapping("/addInfo")
	public Object add(@RequestBody UserInformation userInformation) {
		return userInformationService.insert(userInformation);
	}

	@PostMapping("/getAllInfo")
	public Object list() {
		return userInformationService.selectList();
	}


}
