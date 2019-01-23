package com.bbsee.tec.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * @Author: BBSee
 * @E-Mail: rolltion.zhang@foxmail.com
 * @Date: 2019/1/23 14:23
 * @Description:
 */
@ApiModel(description = "响应模型描述")
public class RestResponse {
	private static final int SUCCESS = 1;
	private static final int FAILED = 0;
	@ApiModelProperty(value = "响应状态码(成功-1，失败0)")
	private int code;
	@ApiModelProperty(value = "响应成功或失败信息")
	private String message;
	@ApiModelProperty(value = "响应数据")
	private Object data;
	private static final Object[] EMPTY = {};

	private RestResponse(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * success with data
	 */
	public static RestResponse success(Object... data) {
		if (null != data && 1 == data.length) {
			return new RestResponse(SUCCESS, "", data[0]);
		}
		return new RestResponse(SUCCESS, "", data);
	}

	/**
	 * success with data and message
	 */
	public static RestResponse success(String message, Object data) {
		return new RestResponse(SUCCESS, message==null?"":message, data);
	}

	/**
	 * failec with message and empty data
	 */
	public static RestResponse failure(String message) {
		return new RestResponse(FAILED, message==null?"":message, EMPTY);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof RestResponse)) return false;
		RestResponse that = (RestResponse) o;
		return code == that.code &&
				Objects.equals(message, that.message) &&
				Objects.equals(data, that.data);
	}

	@Override
	public int hashCode() {

		return Objects.hash(code, message, data);
	}
}
