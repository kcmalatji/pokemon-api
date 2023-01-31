package com.standardbank.pokemonApi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GenerationI  {
	
	@SerializedName("red-blue")
    @Expose
	private RedBlue red_blue;
	private Yellow yellow;
	
	public RedBlue getRed_blue() {
		return red_blue;
	}
	public void setRed_blue(RedBlue red_blue) {
		this.red_blue = red_blue;
	}
	public Yellow getYellow() {
		return yellow;
	}
	public void setYellow(Yellow yellow) {
		this.yellow = yellow;
	}

}
