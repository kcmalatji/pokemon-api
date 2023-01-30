
package com.standardbank.pokemonApi.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Other {

    @SerializedName("dream_world")
    @Expose
    private DreamWorld dreamWorld;

    public DreamWorld getDreamWorld() {
        return dreamWorld;
    }

    public void setDreamWorld(DreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

}
