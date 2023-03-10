package com.standardbank.pokemonApi.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.standardbank.pokemonApi.model.Pokemon;
import com.standardbank.pokemonApi.model.Response;
import com.standardbank.pokemonApi.service.PokemonService;
import com.standardbank.pokemonApi.service.UserService;
import com.standardbank.pokemonApi.util.JwtUtil;

@RestController
@RequestMapping("pokemon/api/v1")
public class PokemonRestController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping("pokemon-list")
	public Response getPokemonList() {

		return pokemonService.getPokemonList();
	}

	@GetMapping("pokemon")
	public Pokemon getPokemonByName(@RequestParam String name) {
		return pokemonService.getPokemon(name);
	}
	
	@GetMapping("pokemon-details")
	public Pokemon getPokemonById(@RequestParam long id) {
		return pokemonService.getPokemonDetails(id);
	}

}
