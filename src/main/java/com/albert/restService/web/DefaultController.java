package com.albert.restService.web;

import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import com.albert.restService.domain.*;

@RestController
@CrossOrigin
public class DefaultController {
	
	@GetMapping("id/{id}")
	public Pokemon getPokemonById(Pokemon pokemon) {

		String url_base = "https://pokeapi.co/api/v2/pokemon/" + pokemon.getId();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<Pokemon> request = new HttpEntity<>(new Pokemon(), headers);

		RestTemplate restTemplate = new RestTemplate();

		try {
			ResponseEntity<Pokemon> response = restTemplate.exchange(url_base, HttpMethod.GET, request, Pokemon.class);
			pokemon = response.getBody();
			System.out.println("Id: " + pokemon.getId() + " - " + pokemon.getName());
			return pokemon;

		} catch (HttpClientErrorException ex) {
			System.out.println("Http code is not 2XX. The server responded: " + ex.getStatusCode() + " Cause: "
					+ ex.getResponseBodyAsString());
			return pokemon;
		} catch (RestClientException ex) {
			System.out.println("The server didn't respond: " + ex.getMessage());
			return pokemon;
		}
		
	}
	
}
