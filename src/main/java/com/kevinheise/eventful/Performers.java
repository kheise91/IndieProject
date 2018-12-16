package com.kevinheise.eventful;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Performers{

	@JsonProperty("performer")
	private List<PerformerItem> performer;

	public void setPerformer(List<PerformerItem> performer){
		this.performer = performer;
	}

	public List<PerformerItem> getPerformer(){
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