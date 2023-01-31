package com.standardbank.pokemonApi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GenerationVi {
	
    @SerializedName("omegaruby-alphasapphire")
    @Expose
	private OmegarubyAlphasapphire omegaruby_alphasapphire;
    @SerializedName("x-y")
    @Expose
    private XY x_y;
	public OmegarubyAlphasapphire getOmegaruby_alphasapphire() {
		return omegaruby_alphasapphire;
	}
	public void setOmegaruby_alphasapphire(OmegarubyAlphasapphire omegaruby_alphasapphire) {
		this.omegaruby_alphasapphire = omegaruby_alphasapphire;
	}
	public XY getX_y() {
		return x_y;
	}
	public void setX_y(XY x_y) {
		this.x_y = x_y;
	}
    

}
