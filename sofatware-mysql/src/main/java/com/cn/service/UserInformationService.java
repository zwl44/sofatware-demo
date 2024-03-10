package com.cn.service;


import com.cn.po.UserInformation;
import com.cn.po.UserInformation;
import com.cn.po.UserInformationAndToken;

import java.util.List;

/**
 * service接口
 * 默认提供的查询/更新/删除方法均针对主键，请根据业务需求自行添加相关方法，条件筛选使用Example，参考select方法（利用DAOMapper.***ByExample）
 * @author tools.49db.cn
 * @version 1.0
 * @date 2024-03-09
 */
public interface UserInformationService {


	/**
	 * @return com.en.po.UserInformation
	 * @throws
	 * @Description 根据ID获取信息
	 * @Param [id]
	 **/
	UserInformationAndToken selectById(long id);

	/**
	 * @return boolean
	 * @throws
	 * @Description 添加数据
	 * @Param [productPo]
	 **/
	boolean insert(UserInformation userInformation);

	/**
	 * @return java.util.List<com.en.po.UserInformation>
	 * @throws
	 * @Description 查询数据库所有信息
	 * @Param []
	 **/
	List<UserInformationAndToken> selectList();



}
