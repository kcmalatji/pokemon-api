package com.standardbank.pokemonApi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.standardbank.pokemonApi.model.Pokemon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
	static final String BASE_URL = "https://pokeapi.co/api/v2";
	Logger logger = LoggerFactory.getLogger(PokemonService.class);

	public List<Pokemon> getPokemonList() {
		logger.info("calling Method getPokemonList()");
		try {
			URL url = new URL("https://pokeapi.co/api/v2/pokemon");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setDoOutput(true);
		
			// For POST only - START
			con.setDoOutput(true);
			
			OutputStream os = con.getOutputStream();
			os.flush();
			os.close();

			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) { //success
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("GET request did not work.");
			}
			
			//  OutputStream out = con.getOutputStream();
			  
			  logger.info("Base_url "+ url.toURI());
			  logger.info("Output "+con.getResponseMessage());
            

           
		} catch (Exception e) {
			logger.error("Exception "+e);
		}

		return new ArrayList<Pokemon>();
	}

	public Pokemon getPokemon(String name) {

		return new Pokemon();
	}
}
