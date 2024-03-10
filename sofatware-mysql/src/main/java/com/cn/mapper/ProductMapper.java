package com.cn.mapper;

import com.cn.po.ProductPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zwl
 * @date 2024年03月08日 22:14:18
 * @packageName com.en.mapper
 * @className ProductMapper
 */
@Mapper
public interface ProductMapper {
	/**
	 * @Description  添加数据
	 * @Param [productPo]
	 * @return boolean
	 * @throws
	 **/
	boolean addInfo(ProductPo product);
	/**
	 * @Description 根据ID获取信息
	 * @Param [id]
	 * @return com.en.po.ProductPo
	 * @throws
	 **/
	ProductPo getInfoById(Long id);
	/**
	 * @Description 查询数据库所有信息
	 * @Param []
	 * @return java.util.List<com.en.po.ProductPo>
	 * @throws
	 **/
	List<ProductPo> getAllInfo();


	boolean delete(Long id);

	boolean update(ProductPo productPo);

}

