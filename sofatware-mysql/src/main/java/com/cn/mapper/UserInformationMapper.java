package com.cn.mapper;

import com.cn.po.ProductPo;
import com.cn.po.UserInformation;
import com.cn.po.UserInformationAndToken;

import java.util.List;

/**
 * @author tools.49db.cn
 * @version 1.0
 * @date 2024-03-09
 */
public interface UserInformationMapper {


	UserInformationAndToken selectById(Long id);

	List<UserInformationAndToken> selectList();

	boolean insert(UserInformation record);

	boolean update(ProductPo productPo);

}