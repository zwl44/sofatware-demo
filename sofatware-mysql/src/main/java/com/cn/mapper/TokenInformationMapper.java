package com.cn.mapper;

import com.cn.po.TokenInformation;
import com.cn.po.UserInformation;

import java.util.List;

/**
 * @author tools.49db.cn
 * @version 1.0
 * @date 2024-03-09
 */
public interface TokenInformationMapper {


	TokenInformation selectById(String token);

	List<TokenInformation> selectList();

	boolean insert(TokenInformation record);
}