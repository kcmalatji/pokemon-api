
package com.standardbank.pokemonApi.model;

public class Stat {


    private Integer base_stat;
    private Integer effort;
    private StatObject stat;

    public Integer getBaseStat() {
        return base_stat;
    }

    public void setBaseStat(Integer base_stat) {
        this.base_stat = base_stat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public StatObject getStat() {
        return stat;
    }

    public void setStat(StatObject stat) {
        this.stat = stat;
    }

}
