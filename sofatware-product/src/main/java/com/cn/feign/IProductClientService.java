package com.cn.feign;

import com.cn.po.ProductPo;
import com.cn.req.ProductIdReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author zwl
 * @date 2024年03月09日 03:07:17
 * @packageName com.en.feign
 * @className IProductClientService
 */
@FeignClient(name = "SOFTWARE-SPRINGCLOUD-MYSQL")
public interface IProductClientService {

	@RequestMapping(method = RequestMethod.POST, value = "/product/getInfoById")
	ProductPo getProduct(@RequestBody ProductIdReq productId);

	@RequestMapping(method = RequestMethod.POST, value = "/product/getAllInfo")
	List<ProductPo> listProduct();

	@RequestMapping(method = RequestMethod.POST, value = "/product/addInfo")
	boolean addPorduct(ProductPo productPo);

	@RequestMapping(method = RequestMethod.POST, value = "/product/deleteInfo")
	Object delete(@RequestBody ProductIdReq productIdReq);

	@RequestMapping(method = RequestMethod.POST, value = "/product/updateInfo")
	Object update(@RequestBody ProductPo productPo);
}
