package com.cn.service.impl;


import com.cn.mapper.UserInformationMapper;
import com.cn.po.UserInformation;
import com.cn.po.UserInformationAndToken;
import com.cn.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * service实现
 *
 * @author tools.49db.cn
 * @version 1.0
 * @date 2024-03-09
 */
@Service
public class UserInformationServiceImpl implements UserInformationService {

	@Resource
	private UserInformationMapper userInformationMapper;


	@Override
	public UserInformationAndToken selectById(long id) {
		return userInformationMapper.selectById(id);
	}

	@Override
	public boolean insert(UserInformation productPo) {
		return userInformationMapper.insert(productPo);
	}

	@Override
	public List<UserInformationAndToken> selectList() {
		return userInformationMapper.selectList();
	}
}
