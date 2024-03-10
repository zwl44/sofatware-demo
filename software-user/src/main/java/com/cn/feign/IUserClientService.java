package com.cn.feign;

import com.cn.po.UserInformation;
import com.cn.po.UserInformationAndToken;
import com.cn.req.ProductIdReq;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zwl
 * @date 2024年03月09日 16:27:30
 * @packageName com.cn.feign
 * @className IUserClientService
 */
@FeignClient(name = "SOFTWARE-SPRINGCLOUD-MYSQL")
public interface IUserClientService {

	@RequestMapping(method = RequestMethod.POST, value = "/user/getInfoById")
	UserInformationAndToken get(@RequestBody ProductIdReq productIdReq);

	@RequestMapping(method = RequestMethod.POST, value = "/user/addInfo")
	Object add(@RequestBody UserInformation userInformation);

	@RequestMapping(method = RequestMethod.POST, value = "/user/getAllInfo")
	Object list();
}
