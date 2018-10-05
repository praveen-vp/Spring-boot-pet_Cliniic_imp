package com.vp.springboot.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
