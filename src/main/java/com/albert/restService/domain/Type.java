package com.albert.restService.domain;

import lombok.Data;

@Data
public class Type {
	
	private String name;
	private String url;
	
	@Override
	public String toString() {
		return "Type [name=" + name + ", url=" + url + "]";
	}
}
