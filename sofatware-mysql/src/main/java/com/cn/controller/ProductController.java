package com.cn.controller;

import com.cn.po.ProductPo;
import com.cn.req.ProductIdReq;
import com.cn.service.IProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zwl
 * @date 2024年03月08日 21:50:48
 * @packageName com.en.controller
 * @className ProductController
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	@Resource
	private IProductService iProductService;

	@PostMapping("/getInfoById")
	public Object get(@RequestBody ProductIdReq productIdReq) {
		return this.iProductService.getInfoById(productIdReq.getId());
	}

	@PostMapping("/addInfo")
	public Object add(@RequestBody ProductPo productPo) {
		return this.iProductService.addInfo(productPo);
	}

	@PostMapping("/getAllInfo")
	public Object list() {
		return this.iProductService.getAllInfo();
	}


	@PostMapping("/deleteInfo")
	public Object delete(@RequestBody ProductIdReq productIdReq) {
		return this.iProductService.delete(productIdReq.getId());
	}

	@PostMapping("/updateInfo")
	public Object update(@RequestBody ProductPo productPo) {
		return this.iProductService.update(productPo);
	}


}
