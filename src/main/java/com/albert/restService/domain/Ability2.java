package com.albert.restService.domain;

import lombok.Data;

@Data
public class Ability2 {
	
	Ability ability;
	private Boolean is_hidden;
	private int slot;
	
	@Override
	public String toString() {
		return "Ability [ability=" + ability.toString() + ", is_hidden=" + is_hidden + ", slot=" + slot + "]";
	}

}
