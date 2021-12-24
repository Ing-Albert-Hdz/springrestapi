package com.albert.restService.domain;

import lombok.Data;

@Data 
public class Type2 {
	
	private int slot;
	private Type type;
	
	@Override
	public String toString() {
		return "Type [slot=" + slot + ", type2=" + type.toString() + "]";
	}
	
	
}
