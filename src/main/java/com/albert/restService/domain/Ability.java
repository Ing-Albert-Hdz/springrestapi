package com.albert.restService.domain;

import lombok.Data;

@Data
public class Ability {
	
	private String name;
	private String url;
	
	@Override
	public String toString() {
		return "Ability2 [name=" + name + ", url=" + url + "]";
	}

}
