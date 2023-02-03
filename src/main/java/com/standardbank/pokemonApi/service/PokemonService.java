package com.standardbank.pokemonApi.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.URL;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.standardbank.pokemonApi.constants.HttpMethods;
import com.standardbank.pokemonApi.model.Pokemon;
import com.standardbank.pokemonApi.model.Response;

@Service
public class PokemonService {
	private static final String BASE_URL = "https://pokeapi.co/api/v2";

	private static final Logger logger =Logger.getLogger(PokemonService.class);

	public Response getPokemonList() {
		logger.info("calling Method getPokemonList()");
		Response rs = new Response();
		try {
			Gson gson = new Gson();
			rs = gson.fromJson(openHttpConnection(HttpMethods.GET.name(), "/pokemon"), Response.class);

		} catch (Exception e) {
			logger.error("Exception " + e);
		}

		return rs;
	}

	public Pokemon getPokemon(String name) {
		logger.info("calling Method getPokemon()");

		Pokemon pokemon = new Pokemon();
		try {
			Gson gson = new Gson();
			pokemon = gson.fromJson(openHttpConnection(HttpMethods.GET.name(), "/pokemon/" + name), Pokemon.class);

		} catch (Exception e) {
			logger.error("Exception " + e);
		}
		return pokemon;
	}
	
	public Pokemon getPokemonDetails(long id) {
		logger.info("calling Method getPokemon()");

		Pokemon pokemon = new Pokemon();
		try {
			Gson gson = new Gson();
			pokemon = gson.fromJson(openHttpConnection(HttpMethods.GET.name(), "/pokemon/" + id), Pokemon.class);

		} catch (Exception e) {
			logger.error("Exception " + e);
		}
		return pokemon;
	}

	private String openHttpConnection(String httpMethod, String endpoint)
			throws MalformedURLException, IOException, ProtocolException, URISyntaxException {
		URL url = new URL(BASE_URL + endpoint);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod(httpMethod);
		con.setDoOutput(true);
		con.setDoOutput(true);
		StringBuilder jsonResponse = new StringBuilder();
		int responseCode = con.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK) { 
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			logger.info("GET Response Code :: " + responseCode);
			logger.info("Base_url " + url.toURI());
			logger.info("Response " + response.toString());
			jsonResponse.append(response.toString());
		} else {
			System.out.println("GET request did not work.");
		}
		return jsonResponse.toString();
	}

}
