
package com.standardbank.pokemonApi.model;

public class VersionGroupDetail {


    private Integer level_learned_at;

    private MoveLearnMethod move_learn_method;

    private VersionGroup version_group;

    public Integer getLevelLearnedAt() {
        return level_learned_at;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.level_learned_at = levelLearnedAt;
    }

    public MoveLearnMethod getMoveLearnMethod() {
        return move_learn_method;
    }

    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.move_learn_method = moveLearnMethod;
    }

    public VersionGroup getVersionGroup() {
        return version_group;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.version_group = versionGroup;
    }

}
