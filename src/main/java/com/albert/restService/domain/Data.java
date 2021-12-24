package com.albert.restService.domain;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Data {
	
	@Getter
	@Setter
    private Integer count;
	@Getter
	@Setter
    private String next;
	@Getter
	@Setter
    private Object previous;
	@Getter
	@Setter
    private List<PokemonDir> results;

	@Override
	public String toString() {
		return "Data [count=" + count + ", next=" + next + ", previous=" + previous + ", results=" + results.toString() + "]";
	}
    
}