package com.standardbank.pokemonApi.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.standardbank.pokemonApi.model.Pokemon;
import com.standardbank.pokemonApi.service.PokemonService;

@RestController
@RequestMapping("pokemon/api/v1")
public class PokemonRestController {

	@Autowired
	private PokemonService pokemonService;

	@GetMapping("pokemon-list")
	public List<Pokemon> getPokemonList() {

		return pokemonService.getPokemonList();
	}

	@GetMapping("pokemon")
	public Pokemon getPokemonByName(@RequestParam String name) {
		return pokemonService.getPokemon(name);
	}

}
