package com.standardbank.pokemonApi.model;

public class JwtResponse {

	private String jwtString;

	public JwtResponse(String jwtToken) {
		this.jwtString = jwtToken;
	}

	public String getJwtString() {
		return jwtString;
	}

}
