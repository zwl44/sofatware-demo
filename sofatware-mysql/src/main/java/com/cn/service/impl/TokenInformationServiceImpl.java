package com.cn.service.impl;


import com.cn.mapper.TokenInformationMapper;
import com.cn.mapper.TokenInformationMapper;
import com.cn.po.TokenInformation;
import com.cn.po.TokenInformation;
import com.cn.service.TokenInformationService;
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
public class TokenInformationServiceImpl implements TokenInformationService {

	@Resource
	private TokenInformationMapper tokenInformationMapper;


	@Override
	public TokenInformation selectByToken(String token) {
		return tokenInformationMapper.selectById(token);
	}

	@Override
	public boolean insert(TokenInformation productPo) {
		return tokenInformationMapper.insert(productPo);
	}

	@Override
	public List<TokenInformation> selectList() {
		return tokenInformationMapper.selectList();
	}
}
