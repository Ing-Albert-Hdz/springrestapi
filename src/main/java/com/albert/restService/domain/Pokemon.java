package com.albert.restService.domain;

import java.util.List;
import lombok.Data;

@Data
public class Pokemon {
	
	private String url;
	private int id;
	private String name;
	private int weight;
	private int height;
	private List<Type2> types;
	private List<Ability2> abilities;
	private Sprite sprites;
	private List<Stat2> stats;
	
	
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", weight=" + weight + ", height=" + height + ", sprites="
				+ sprites + "]";
	}

}
