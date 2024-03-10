package com.cn.service.impl;


import com.cn.mapper.ProductMapper;
import com.cn.po.ProductPo;
import com.cn.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zwl
 * @date 2024年03月08日 22:13:05
 * @packageName com.en.service.impl
 * @className ProductServiceImpl
 */
@Service
public class ProductServiceImpl implements IProductService {

	@Resource
	private ProductMapper productMapper;

	@Override
	public ProductPo getInfoById(long id) {
		return productMapper.getInfoById(id);
	}

	@Override
	public boolean addInfo(ProductPo productPo) {
		return productMapper.addInfo(productPo);
	}

	@Override
	public List<ProductPo> getAllInfo() {
		return productMapper.getAllInfo();
	}

	@Override
	public boolean delete(Long id) {
		return productMapper.delete(id);
	}

	@Override
	public boolean update(ProductPo productPo) {
		return productMapper.update(productPo);
	}

}
