package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Performers{

	@JsonProperty("performer")
	private Performer performer;

	public void setPerformer(Performer performer){
		this.performer = performer;
	}

	public Performer getPerformer(){
		return performer;
	}

	@Override
 	public String toString(){
		return 
			"Performers{" + 
			"performer = '" + performer + '\'' + 
			"}";
		}
}