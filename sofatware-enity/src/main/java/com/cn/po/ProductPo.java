package com.cn.po;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zwl
 * @date 2024年03月08日 14:43:03
 * @packageName com.en.po
 * @className ProductPo
 * 产品信息
 */
@Data
@NoArgsConstructor
public class ProductPo {
	/**
	 * 产品id
	 */
	private Long id;
	/**
	 * 产品名称
	 */
	private String productName;
	/**
	 * 产品描述
	 */
	private String productDesc;
}
