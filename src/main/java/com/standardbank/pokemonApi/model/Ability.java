
package com.standardbank.pokemonApi.model;

public class Ability {

	private AbilityObject ability;
    private Boolean is_hidden;
    private Integer slot;


    public AbilityObject getAbility() {
		return ability;
	}

	public void setAbility(AbilityObject ability) {
		this.ability = ability;
	}

	public Boolean getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

}
