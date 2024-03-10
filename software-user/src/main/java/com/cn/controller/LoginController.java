package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zwl
 * @date 2024年03月09日 18:03:08
 * @packageName com.cn.controller
 * @className LoginController
 */
@Controller
@RequestMapping("/user")
public class LoginController {
	@RequestMapping("/login")
	public String show() {
		return "index";
	}
}
