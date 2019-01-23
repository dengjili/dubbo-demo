package org.dubbo.order.api.base;

import java.io.Serializable;

public class OrderRequest<T> implements Serializable {
	/**
	 * 网络调用需要序列化
	 */
	private static final long serialVersionUID = 2279590428209541954L;
	
	private T data;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "OrderRequest [data=" + data + "]";
	}
}
