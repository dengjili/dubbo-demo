package org.dubbo.order.api.base;

import java.io.Serializable;

public class Foo implements Serializable {

	private static final long serialVersionUID = -6963226626120629937L;
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Foo [id=" + id + ", name=" + name + "]";
	}

}
