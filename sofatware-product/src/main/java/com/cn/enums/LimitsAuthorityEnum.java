package com.cn.enums;

/**
 * @author zwl
 * @date 2024年03月09日 19:09:18
 * @packageName com.cn.enums
 * @className ProductEnum
 * tokenID 用来配置相关接口权限，这里只是demo用枚举存储，实际可以用数据表进行编辑
 */
public enum LimitsAuthorityEnum {
	ADD_PRODUCT(1, "/product/addInfo"),
	UPDATE_PRODUCT(2, "/product/updateInfo"),
	DELETE_PRODUCT(3, "/product/deleteInfo"),
	SELECT_PRODUCT(4, "/product/getInfoById"),
	SELECT_PRODUCT_ALL(5, "/product/getAllInfo");

	private final Integer id;

	private final String url;

	LimitsAuthorityEnum(Integer id, String url) {
		this.id = id;
		this.url = url;
	}

	public static int getLimitId(String url) {
		LimitsAuthorityEnum[] values = LimitsAuthorityEnum.values();
		for (LimitsAuthorityEnum l : values) {
			if (l.url.equals(url)) {
				return l.id;
			}
		}
		return 0;
	}

	public Integer getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}
}
