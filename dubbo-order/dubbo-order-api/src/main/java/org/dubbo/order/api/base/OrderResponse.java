package org.dubbo.order.api.base;

import java.io.Serializable;

public class OrderResponse<T> implements Serializable {
	/**
	 * 网络调用需要序列化
	 */
	private static final long serialVersionUID = 2279590428209541954L;
	
	private String code;
	private String desc;
	private T data;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "OrderResponse [code=" + code + ", desc=" + desc + ", data=" + data + "]";
	}
}
