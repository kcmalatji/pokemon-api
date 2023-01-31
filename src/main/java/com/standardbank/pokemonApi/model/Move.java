
package com.standardbank.pokemonApi.model;

import java.util.List;

public class Move {

  
    private MoveObject move;

    private List<VersionGroupDetail> version_group_details ;

	public MoveObject getMove() {
		return move;
	}

	public void setMove(MoveObject move) {
		this.move = move;
	}

	public List<VersionGroupDetail> getVersion_group_details() {
		return version_group_details;
	}

	public void setVersion_group_details(List<VersionGroupDetail> version_group_details) {
		this.version_group_details = version_group_details;
	}

   

}
