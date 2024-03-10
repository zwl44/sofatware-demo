package com.cn.po;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zwl
 * @date 2024年03月09日 11:44:21
 * @packageName com.cn.po
 * @className TokenInformation
 * token信息
 */
@Data
@NoArgsConstructor
public class TokenInformation {
	/**
	 * 唯一
	 */
	private Long id;

	/**
	 * token信息
	 */
	private String token;

	/**
	 * 权限信息
	 */
	private String limitsAuthority;
}
