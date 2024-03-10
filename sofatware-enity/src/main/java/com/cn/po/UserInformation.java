package com.cn.po;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zwl
 * @date 2024年03月09日 11:38:32
 * @packageName com.cn.po
 * @className UserInformation
 * 用户信息
 */
@Data
@NoArgsConstructor
public class UserInformation {

	/**
	*用户id
	 */
	private Long id;

	/**
	 *用户名称
	 */
	private String name;

	/**
	 *用户密码
	 */
	private String passWord;

	/**
	 *用户权限token
	 */
	private Long tokenId;

}
