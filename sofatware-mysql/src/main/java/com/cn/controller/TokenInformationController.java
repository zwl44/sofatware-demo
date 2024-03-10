package com.cn.controller;


import com.cn.po.TokenInformation;
import com.cn.po.UserInformation;
import com.cn.req.ProductIdReq;
import com.cn.req.TokenReq;
import com.cn.service.TokenInformationService;
import com.cn.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author tools.49db.cn
 * @version 1.0
 * @date 2024-03-09
 */
@RestController
@RequestMapping("/token")
public class TokenInformationController {
	@Autowired
	private TokenInformationService tokenInformationService;

	@PostMapping("/getInfoByToken")
	public Object get(@RequestBody TokenReq tokenReq) {
		return tokenInformationService.selectByToken(tokenReq.getToken());
	}

	@PostMapping("/addInfo")
	public Object add(@RequestBody TokenInformation tokenInformation) {
		return tokenInformationService.insert(tokenInformation);
	}

	@PostMapping("/getAllInfo")
	public Object list() {
		return tokenInformationService.selectList();
	}


}
