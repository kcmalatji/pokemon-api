package com.standardbank.pokemonApi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GenerationV {
    @SerializedName("black-white")
    @Expose
	private BlackWhite black_white;

	public BlackWhite getBlack_white() {
		return black_white;
	}

	public void setBlack_white(BlackWhite black_white) {
		this.black_white = black_white;
	}
}
