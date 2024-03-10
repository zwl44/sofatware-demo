package com.cn.controller;

import com.cn.feign.IProductClientService;

import com.cn.po.ProductPo;
import com.cn.req.ProductIdReq;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zwl
 * @date 2024年03月08日 22:44:06
 * @packageName com.en.controller
 * @className ConsumerProductController
 */
@RestController
@RequestMapping("/product")
public class ConsumerProductController {
	@Resource
	private IProductClientService iProductClientService;

	@PostMapping("/getInfoById")
	public Object getProduct(@RequestBody ProductIdReq productIdReq) {

		return iProductClientService.getProduct(productIdReq);
	}

	@PostMapping("/getAllInfo")
	public Object listProduct() {

		return iProductClientService.listProduct();
	}

	@PostMapping("/addInfo")
	public Object addProduct(@RequestBody ProductPo productPo) {

		return iProductClientService.addPorduct(productPo);
	}

	@PostMapping("/deleteInfo")
	public Object delete(@RequestBody ProductIdReq productIdReq) {
		return iProductClientService.delete(productIdReq);
	}

	@PostMapping("/updateInfo")
	public Object update(@RequestBody ProductPo productPo) {
		return iProductClientService.update(productPo);
	}
}
