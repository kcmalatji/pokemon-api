package com.standardbank.pokemonApi.service;

import org.springframework.stereotype.Service;
import com.standardbank.pokemonApi.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {

	public List<Pokemon> getPokemonList() {

		return new ArrayList<Pokemon>();
	}

	public Pokemon getPokemon(String name) {

		return new Pokemon();
	}
}
