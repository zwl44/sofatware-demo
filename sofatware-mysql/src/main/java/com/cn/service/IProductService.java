package com.cn.service;


import com.cn.po.ProductPo;

import java.util.List;

/**
 * @author zwl
 * @date 2024年03月08日 22:12:20
 * @packageName com.en.service.impl
 * @className IProductService
 */
public interface IProductService {
	/**
	 * @return com.en.po.ProductPo
	 * @throws
	 * @Description 根据ID获取信息
	 * @Param [id]
	 **/
	ProductPo getInfoById(long id);

	/**
	 * @return boolean
	 * @throws
	 * @Description 添加数据
	 * @Param [productPo]
	 **/
	boolean addInfo(ProductPo productPo);

	/**
	 * @return java.util.List<com.en.po.ProductPo>
	 * @throws
	 * @Description 查询数据库所有信息
	 * @Param []
	 **/
	List<ProductPo> getAllInfo();

	boolean delete(Long id);

	boolean update(ProductPo productPo);
}
