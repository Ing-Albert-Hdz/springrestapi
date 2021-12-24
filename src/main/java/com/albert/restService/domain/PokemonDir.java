package com.albert.restService.domain;

import lombok.Data;

@Data
public class PokemonDir {
	
	private String name;
	private String url;
	
	@Override
	public String toString() {
		return "PokemonDir [name=" + name + ", url=" + url + "]";
	}

}
