package com.cn.feign;

import com.cn.po.ProductPo;
import com.cn.po.UserInformationAndToken;
import com.cn.req.ProductIdReq;
import com.cn.req.TokenReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author zwl
 * @date 2024年03月09日 03:07:17
 * @packageName com.en.feign
 * @className IProductClientService
 */
@FeignClient(name = "SOFTWARE-SPRINGCLOUD-USER")
public interface IUerTokenClientService {

	@RequestMapping(method = RequestMethod.POST, value = "/user/getInfoById")
	UserInformationAndToken get(@RequestBody ProductIdReq productIdReq) ;

}
