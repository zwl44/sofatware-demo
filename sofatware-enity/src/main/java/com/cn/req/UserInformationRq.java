package com.cn.req;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 带分页查询请求封装类-建议正式使用前先进行字段调整，删除不必要的字段
 *
 * @author tools.49db.cn
 * @version 1.0
 * @date 2024-03-09
 */
@Data
@NoArgsConstructor
public class UserInformationRq {


	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String passWord;
	private Integer tokenId;



}
